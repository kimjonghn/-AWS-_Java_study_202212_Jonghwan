package windowBuilder.view.panel;

import java.awt.CardLayout;

import javax.swing.JPanel;

public class MainPanel extends InitPanel{
   
   private static MainPanel instance;
   private CardLayout mainCard;
   
   public static MainPanel getInstance() {
	      if(instance == null) {
	         instance = new MainPanel();
	      }
	      return instance;
	   }
   
   
   
   public MainPanel() {
      mainCard = new CardLayout();      
      setLayout(mainCard);
      
      
      
   }
   
   public void init() {
	   	  LoginPanel loginPanel = new LoginPanel();
	      add(loginPanel, "loginPanel");
	      
	      RegisterPanel registerPanel = new RegisterPanel();
	      add(registerPanel, "registerPanel");
   }
   
}
