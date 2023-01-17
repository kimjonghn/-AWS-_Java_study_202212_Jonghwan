package usermanagement.fram;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class UserManagementFrame extends JFrame {

	private CardLayout mainCard;
	private JPanel mainPanel;
	private JTextField UsernameField;
	private JPasswordField passwordField;
	private JTextField registerUsernameField;
	private JTextField registerNameField;
	private JTextField registerOasswordFiled;
	private JTextField registerEmailFiled;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserManagementFrame frame = new UserManagementFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public UserManagementFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 684, 543);
		mainPanel = new JPanel();
		mainPanel.setBackground(new Color(255, 255, 255));
		mainPanel.setBorder(null);

		setContentPane(mainPanel);
		
		mainCard = new CardLayout();
		mainPanel.setLayout(mainCard);
		
		JPanel loginpanel = new JPanel();
		
		loginpanel.setBackground(new Color(255, 255, 255));
		mainPanel.add(loginpanel, "loginPanel");
		loginpanel.setLayout(null);
		
		JLabel logoText = new JLabel("User Management Login");
		logoText.setHorizontalAlignment(SwingConstants.CENTER);
		logoText.setFont(new Font("D2Coding", Font.BOLD, 20));
		logoText.setBounds(192, 10, 276, 87);
		loginpanel.add(logoText);
		
		JLabel Logintext = new JLabel("Login");
		Logintext.setFont(new Font("D2Coding", Font.BOLD, 19));
		Logintext.setHorizontalAlignment(SwingConstants.CENTER);
		Logintext.setBounds(287, 90, 87, 41);
		loginpanel.add(Logintext);
		
		UsernameField = new JTextField();
		UsernameField.setBounds(71, 219, 528, 41);
		loginpanel.add(UsernameField);
		UsernameField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(71, 295, 528, 41);
		loginpanel.add(passwordField);
		
		JLabel usernameLabel = new JLabel("username or email");
		usernameLabel.setFont(new Font("D2Coding", Font.BOLD, 15));
		usernameLabel.setHorizontalAlignment(SwingConstants.LEFT);
		usernameLabel.setBounds(71, 194, 174, 15);
		loginpanel.add(usernameLabel);
		
		JLabel passwordLabel = new JLabel("password");
		passwordLabel.setFont(new Font("D2Coding", Font.BOLD, 15));
		passwordLabel.setHorizontalAlignment(SwingConstants.LEFT);
		passwordLabel.setBounds(71, 270, 149, 15);
		loginpanel.add(passwordLabel);
		
		JButton loginButton = new JButton("Login");
		loginButton.setBackground(new Color(255, 255, 255));
		loginButton.setFont(new Font("D2Coding", Font.BOLD, 27));
		loginButton.setBounds(71, 360, 529, 41);
		loginpanel.add(loginButton);
		
		JLabel signupDesc = new JLabel("Don't have an account?");
		signupDesc.setFont(new Font("D2Coding", Font.BOLD, 11));
		signupDesc.setHorizontalAlignment(SwingConstants.CENTER);
		signupDesc.setBounds(196, 421, 203, 30);
		loginpanel.add(signupDesc);
		
		JLabel signupLink = new JLabel("Sign up");
		signupLink.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				mainCard.show(mainPanel, "registerPanel");
			}
		});
		signupLink.setForeground(new Color(0, 255, 255));
		signupLink.setFont(new Font("D2Coding", Font.BOLD, 11));
		signupLink.setBounds(389, 429, 57, 15);
		loginpanel.add(signupLink);
		
		JLabel forgotPasswordLink = new JLabel("Forgot your password?");
		forgotPasswordLink.setForeground(new Color(0, 255, 255));
		forgotPasswordLink.setFont(new Font("D2Coding", Font.BOLD, 15));
		forgotPasswordLink.setHorizontalAlignment(SwingConstants.CENTER);
		forgotPasswordLink.setBounds(233, 461, 203, 22);
		loginpanel.add(forgotPasswordLink);
		
		JPanel registerPanel = new JPanel();
		mainPanel.add(registerPanel, "registerPanel");
		registerPanel.setLayout(null);
		
		JLabel signinLink = new JLabel("Sign in");
		signinLink.setFont(new Font("굴림", Font.BOLD, 15));
		signinLink.setForeground(new Color(0, 255, 255));
		signinLink.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				mainCard.show(mainPanel, "loginPanel");
			}
		});
		signinLink.setHorizontalAlignment(SwingConstants.CENTER);
		signinLink.setBounds(304, 473, 57, 21);
		registerPanel.add(signinLink);
		
		JLabel registerLogoText = new JLabel("User Management");
		registerLogoText.setHorizontalAlignment(SwingConstants.CENTER);
		registerLogoText.setFont(new Font("D2Coding", Font.BOLD, 20));
		registerLogoText.setBounds(192, 10, 276, 87);
		registerPanel.add(registerLogoText);
		
		JLabel registerText = new JLabel("Register");
		registerText.setHorizontalAlignment(SwingConstants.CENTER);
		registerText.setFont(new Font("D2Coding", Font.BOLD, 19));
		registerText.setBounds(287, 90, 87, 41);
		registerPanel.add(registerText);
		
		registerUsernameField = new JTextField();
		registerUsernameField.setColumns(10);
		registerUsernameField.setBounds(74, 166, 528, 30);
		registerPanel.add(registerUsernameField);
		
		JLabel registerUsername = new JLabel("username");
		registerUsername.setHorizontalAlignment(SwingConstants.LEFT);
		registerUsername.setFont(new Font("D2Coding", Font.BOLD, 15));
		registerUsername.setBounds(74, 141, 174, 15);
		registerPanel.add(registerUsername);
		
		JLabel registerPsswordLabel = new JLabel("password");
		registerPsswordLabel.setHorizontalAlignment(SwingConstants.LEFT);
		registerPsswordLabel.setFont(new Font("D2Coding", Font.BOLD, 15));
		registerPsswordLabel.setBounds(74, 207, 149, 15);
		registerPanel.add(registerPsswordLabel);
		
		registerNameField = new JTextField();
		registerNameField.setColumns(10);
		registerNameField.setBounds(74, 297, 528, 30);
		registerPanel.add(registerNameField);
		
		JLabel registerNameLabel = new JLabel("name");
		registerNameLabel.setHorizontalAlignment(SwingConstants.LEFT);
		registerNameLabel.setFont(new Font("D2Coding", Font.BOLD, 15));
		registerNameLabel.setBounds(74, 272, 174, 15);
		registerPanel.add(registerNameLabel);
		
		JLabel registerEmailLabel = new JLabel("email");
		registerEmailLabel.setHorizontalAlignment(SwingConstants.LEFT);
		registerEmailLabel.setFont(new Font("D2Coding", Font.BOLD, 15));
		registerEmailLabel.setBounds(74, 337, 149, 15);
		registerPanel.add(registerEmailLabel);
		
		registerOasswordFiled = new JTextField();
		registerOasswordFiled.setColumns(10);
		registerOasswordFiled.setBounds(74, 232, 528, 30);
		registerPanel.add(registerOasswordFiled);
		
		registerEmailFiled = new JTextField();
		registerEmailFiled.setColumns(10);
		registerEmailFiled.setBounds(74, 362, 528, 30);
		registerPanel.add(registerEmailFiled);
		
		JButton registerButton = new JButton("Register");
		registerButton.setFont(new Font("D2Coding", Font.BOLD, 27));
		registerButton.setBackground(Color.WHITE);
		registerButton.setBounds(74, 417, 529, 41);
		registerPanel.add(registerButton);
	}
}
