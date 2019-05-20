package swing;
 import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

public class MyWindowGridLayout extends JFrame implements ActionListener {
	
	private static final long serialVersionUID = -4939544011287453046L;

	public MyWindowGridLayout() 
	{
		super  ("My first application");
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setSize(600,400);
		this.setLocationRelativeTo(null);
		
		 JPanel contentPane = (JPanel) this.getContentPane();
		 contentPane.setLayout(new FlowLayout());
		 
		 JButton btnPushMe = new JButton( "Push me ");
		 btnPushMe.addActionListener(this);
		 contentPane.add( btnPushMe );
		 
		 JButton btnClickMe = new JButton( "Click me ");
		 contentPane.add( btnClickMe );
		 
		 JCheckBox chkCheckMe =  new JCheckBox( "Check me ");
		 contentPane.add( chkCheckMe );
		 
		 JTextField txtEditMe = new JTextField( "Edit me" );
		 txtEditMe.setPreferredSize(new Dimension (120, 30));
		 contentPane.add( txtEditMe); 
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("bouton cliqué");
	}

	public static void main(String[] args) throws Exception 
	{
		UIManager.setLookAndFeel(new NimbusLookAndFeel());
		
		// Start la fenetre
		MyWindowGridLayout myWindow = new MyWindowGridLayout(); 
		myWindow.setVisible(true);
	}

}
 