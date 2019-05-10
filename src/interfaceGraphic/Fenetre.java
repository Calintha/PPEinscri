package interfaceGraphic;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class Fenetre {
	private JFrame fenetre;

	public Fenetre() {
		fenetre = new JFrame();

		fenetre.setTitle("Application d'inscriptions sportive");
		fenetre.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		fenetre.setResizable(false);
		fenetre.setLayout(null);
		fenetre.setSize(800, 600);
		fenetre.setLocationRelativeTo(null);
		fenetre.setVisible(false);
	}

	public JFrame getFenetre() {
		return fenetre;
	}
}