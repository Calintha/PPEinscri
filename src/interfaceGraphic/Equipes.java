package interfaceGraphic;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Equipes {
	private final Fenetre fenetre;

	private final Font policeTitre = new Font("MONOSPACED", Font.BOLD, 30);

	public Equipes() {
		fenetre = new Fenetre();
		setPersonnesPanel();
	}

	private void setPersonnesPanel() {
		JPanel panel = new JPanel();

		JLabel titre = new JLabel("Equipes :");
		titre.setFont(policeTitre);
		panel.add(titre, "Center");
		panel.setBorder(new EmptyBorder(20, 0, 15, 0));

		fenetre.getFenetre().setContentPane(panel);
	}

	public JFrame getFenetre() {
		return fenetre.getFenetre();
	}
}
