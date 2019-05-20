package panel;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

import panel.MyWindow;
import javax.swing.JLayeredPane;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.BorderLayout;

public class MyWindow extends JFrame {
	
	private static final long serialVersionUID = -4939544011287453046L;
	private JLayeredPane layeredPane;
	private JPanel panel2;
	private JPanel panel1;
	private JPanel panel3;
	private JPanel panel4;
	private JLayeredPane layeredPane_1;

	public MyWindow() 
	{
		super  ("Application inscriptions");
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setSize(600,400);
		this.setLocationRelativeTo(null);
		getContentPane().setLayout(null);
		
		layeredPane_1 = new JLayeredPane();
		layeredPane_1.setBounds(6, 81, 570, 266);
		getContentPane().add(layeredPane_1);
		layeredPane_1.setLayout(new CardLayout(0, 0));
		
		panel1 = new JPanel();
		layeredPane_1.add(panel1, "name_64712820651600");
		
		JLabel lblPanel = new JLabel("Panel 1");
		panel1.add(lblPanel);
		
		panel2 = new JPanel();
		layeredPane_1.add(panel2, "name_64716855381100");
		
		JLabel lblPanel_1 = new JLabel("Panel 2");
		panel2.add(lblPanel_1);
		
		panel3 = new JPanel();
		layeredPane_1.add(panel3, "name_64719606386800");
		
		JLabel lblPanel_2 = new JLabel("Panel 3");
		panel3.add(lblPanel_2);
		
		panel4 = new JPanel();
		layeredPane_1.add(panel4, "name_64722897003500");
		
		JLabel lblPanel_3 = new JLabel("panel 4");
		panel4.add(lblPanel_3);
		
		JButton btnPanel = new JButton("Panel 1");
		btnPanel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(panel1);
			}
		});
		btnPanel.setBounds(6, 6, 90, 28);
		getContentPane().add(btnPanel);
		
		JButton btnPanel_1 = new JButton("Panel 2");
		btnPanel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(panel2);
			}
		});
		btnPanel_1.setBounds(121, 6, 90, 28);
		getContentPane().add(btnPanel_1);
		
		JButton btnPanel_2 = new JButton("Panel 3");
		btnPanel_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(panel3);
			}
		});
		btnPanel_2.setBounds(238, 6, 90, 28);
		getContentPane().add(btnPanel_2);
		
		JButton btnPanel_3 = new JButton("Panel 4");
		btnPanel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(panel4);
			}
		});
		btnPanel_3.setBounds(360, 6, 90, 28);
		getContentPane().add(btnPanel_3);
	}

	public void switchPanels(JPanel panel)
	{
		layeredPane.removeAll();
		layeredPane.add(panel);
		layeredPane.repaint();
		layeredPane.revalidate();
	}

	public static void main(String[] args) throws Exception 
	{
		UIManager.setLookAndFeel(new NimbusLookAndFeel());
		
		// Start la fenetre
		MyWindow myWindow = new MyWindow(); 
		myWindow.setVisible(true);
	}
}
