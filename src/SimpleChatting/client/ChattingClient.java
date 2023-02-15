package SimpleChatting.client;

import java.awt.EventQueue;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ConnectException;
import java.net.Socket;
import java.rmi.UnknownHostException;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class ChattingClient extends JFrame {
	
	private Socket socket;
	private String username;

	private JPanel contentPane;
	private JTextField ipInput;
	private JTextField portInput;
	private JTextArea contentView;
	private JTextField  messageinput;
	private JList userList;
	private DefaultListModel<String> userListModel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChattingClient frame = new ChattingClient();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ChattingClient() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 593, 421);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton connectButton = new JButton("연결");
		connectButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String ip = null;
				int port = 0;
				
				ip = ipInput.getText();
				port = Integer.parseInt(portInput.getText());
				
				try {
				socket = new Socket(ip, port);//소켓 객체생성
				
				JOptionPane.showMessageDialog(null, 
						socket.getInetAddress() + "서버 접속", 
						"접속성공", 
						JOptionPane.INFORMATION_MESSAGE);
					
					InputStream inputStream = socket.getInputStream();//서버로 부터 데이터가 들어올수있는 통로를 열어줌
					BufferedReader in = new BufferedReader(new InputStreamReader(inputStream)); 
					
					if(in.readLine().equals("join")) { //in.readLine이 join을 받는다. 
						username = JOptionPane.showInputDialog(null, "사용자이름을 입력하세요.", JOptionPane.INFORMATION_MESSAGE);
						
						OutputStream outputStream = socket.getOutputStream(); //서버한테 갈수있는 통로를 열어줌
						PrintWriter out = new PrintWriter(outputStream, true); //서버한테 값을 줌
						
						out.println(username); //서버한테 줄 내용
						
						
					}
					
					Thread thread = new Thread(() -> {						
							try {
								InputStream input = socket.getInputStream();
								BufferedReader reader = new BufferedReader(new InputStreamReader(input));
								
								while(true) {
									String message = reader.readLine();
									if(message.startsWith("@welcome")) { //@Welcom으로 시작하니?
										int kokenIndex = message.indexOf("/"); // /위치를 찾는거
										message = message.substring(kokenIndex + 1);
									}else if(message.startsWith("@userList")) {
										int tokenIndex = message.indexOf("/");
										message = message.substring(tokenIndex + 1);
										String[] usernames = message.split(",");		
										userListModel.clear();
										for(String username : usernames) {
											userListModel.addElement(username);
										}
										continue;
									}
									contentView.append(message + "\n"); 
									
								}
							} catch (IOException e1) {
								e1.printStackTrace();
							}
						
						});
					
						thread.start();
				
				}catch(ConnectException e1){
					JOptionPane.showMessageDialog(null,  
							"서버 접속실패", 
							"접속실패", 
							JOptionPane.ERROR_MESSAGE);
				}
				
				catch(UnknownHostException e1){
					e1.printStackTrace();
				}catch(IOException e1) {
					e1.printStackTrace();
				}
			}
		});
		connectButton.setBounds(476, 10, 89, 23);
		contentPane.add(connectButton);
		
		ipInput = new JTextField();
		ipInput.setBounds(310, 11, 105, 21);
		contentPane.add(ipInput);
		ipInput.setColumns(10);
		
		portInput = new JTextField();
		portInput.setColumns(10);
		portInput.setBounds(416, 11, 58, 21);
		contentPane.add(portInput);
		
		JScrollPane contentScroll = new JScrollPane();
		contentScroll.setBounds(12, 10, 286, 291);
		contentPane.add(contentScroll);
		
		contentView = new JTextArea();
		contentScroll.setViewportView(contentView);
		
		JScrollPane userListScroll = new JScrollPane();
		userListScroll.setBounds(310, 74, 255, 226);
		contentPane.add(userListScroll);
		
		userListModel = new DefaultListModel<>();
		userList = new JList(userListModel);
		userListScroll.setViewportView(userList);
		
		JScrollPane messagescroll = new JScrollPane();
		messagescroll.setBounds(12, 311, 458, 61);
		contentPane.add(messagescroll);
		
		messageinput = new JTextField();
		messageinput.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					try {
						OutputStream outputStream = socket.getOutputStream();
						PrintWriter out = new PrintWriter(outputStream, true);
						
						out.println(username + ":" + messageinput.getText());						
						messageinput.setText("");
						
						}  catch(IOException e1) {
							e1.printStackTrace();
						}						
					}	
				}
			
		});
		messagescroll.setViewportView(messageinput);
		
		JButton sendButton = new JButton("전송");
		sendButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
					if(!messageinput.getText().isBlank()) {
						try {
						OutputStream outputStream = socket.getOutputStream();
						PrintWriter out = new PrintWriter(outputStream, true);
						
						out.println(username + ":" + messageinput.getText());						
						messageinput.setText("");
						
						}  catch(IOException e1) {
							e1.printStackTrace();
						}						
					}	
				}
		});		
		sendButton.setBounds(476, 310, 89, 62);
		contentPane.add(sendButton);
	}
}
