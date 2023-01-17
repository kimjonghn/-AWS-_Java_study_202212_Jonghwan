package windowBuilder.view.frame;

	
	import javax.swing.JFrame;
import javax.swing.JPanel;

import windowBuilder.view.panel.MainPanel;

	

	public class MainFrame extends JFrame {
	   

	   
	   
	   public MainFrame() {
	      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      setBounds(100, 100, 600, 500);
	      System.out.println();
	      
	      JPanel mainPanel = MainPanel.getInstance();
//	      mainPanel.init();
	      setContentPane(mainPanel);
	   }
	}

	