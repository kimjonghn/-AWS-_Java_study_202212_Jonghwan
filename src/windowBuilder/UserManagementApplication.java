package windowBuilder;

import java.awt.EventQueue;

import windowBuilder.view.frame.MainFrame;

public class UserManagementApplication{//jFrame상속받음
	
	
	public static void main(String[] args) {
		
		
		
		Runnable runnable = new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
					frame.setVisible(true); //setvisible 보이게하게끔 만들어 주겠다.
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		};
		
		EventQueue.invokeLater(runnable);
	}

	

}
