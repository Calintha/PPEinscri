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
	private JPanel panel4;
	private JPanel panel3;
	private JPanel panel2;
	private JPanel panel1;
	private JLayeredPane layeredPane_1;


	public MyWindow() 
	{
		super  ("Application inscriptions");
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setSize(600,400);
		this.setLocationRelativeTo(null);
		getContentPane().setLayout(null);
		
		layeredPane_1 = new JLayeredPane();
		layeredPane_1.setBounds(6, 83, 570, 264);
		getContentPane().add(layeredPane_1);
		layeredPane_1.setLayout(new CardLayout(0, 0));
		
		panel1 = new JPanel();
		layeredPane_1.add(panel1, "name_73563567718400");
		panel1.setLayout(null);
		
		JLabel lblPanel = new JLabel("Panel 1");
		lblPanel.setHorizontalAlignment(SwingConstants.CENTER);
		lblPanel.setBounds(78, 81, 392, 96);
		panel1.add(lblPanel);
		
		panel2 = new JPanel();
		layeredPane_1.add(panel2, "name_73569349296200");
		panel2.setLayout(null);
		
		JLabel lblPanel_1 = new JLabel("Panel 2");
		lblPanel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblPanel_1.setBounds(95, 80, 392, 96);
		panel2.add(lblPanel_1);
		
		panel3 = new JPanel();
		layeredPane_1.add(panel3, "name_73572818780000");
		panel3.setLayout(null);
		
		JLabel lblPanel_2 = new JLabel("Panel 3");
		lblPanel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblPanel_2.setBounds(83, 85, 392, 96);
		panel3.add(lblPanel_2);
		
		panel4 = new JPanel();
		layeredPane_1.add(panel4, "name_73575573573300");
		panel4.setLayout(null);
		
		JLabel lblPanel_3 = new JLabel("Panel 4");
		lblPanel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblPanel_3.setBounds(79, 83, 392, 96);
		panel4.add(lblPanel_3);
		
		JButton btnPanel = new JButton("panel 1");
		btnPanel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(panel1);
			}
		});
		btnPanel.setBounds(6, 6, 90, 28);
		getContentPane().add(btnPanel);
		
		JButton btnPanel_1 = new JButton("panel 2");
		btnPanel_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(panel2);
			}
		});
		btnPanel_1.setBounds(108, 6, 90, 28);
		getContentPane().add(btnPanel_1);
		
		JButton btnPanel_2 = new JButton("panel 3");
		btnPanel_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(panel3);
			}
		});
		btnPanel_2.setBounds(210, 6, 90, 28);
		getContentPane().add(btnPanel_2);
		
		JButton btnPanel_3 = new JButton("panel 4");
		btnPanel_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(panel4);
			}
		});
		btnPanel_3.setBounds(312, 6, 90, 28);
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
