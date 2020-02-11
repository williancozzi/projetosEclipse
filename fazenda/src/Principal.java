/*import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import br.ucb.fazenda.Fazenda;

public class Principal extends JDialog {

	private JLabel lblLitros = new JLabel("Litros tirados");
	private JButton btnLeite = new JButton("Tirar Leite");
	private Fazenda fazenda;
	
	public Principal() {
		try {
			mostra();
		} catch(Exception ex) {
			ex.printStackTrace();
		}
	}

	public void mostra() throws Exception {

		this.getContentPane().setLayout(null);
		this.getContentPane().setBackground(new Color(153, 255, 153));
		this.setSize(336, 230);
		this.setLocation(-1006, 365);
		this.setTitle("Mimosa");
		this.setResizable(false);
		this.setModal(true);

		lblLitros.setBounds(new Rectangle(120, 128, 80, 13));
		this.getContentPane().add(lblLitros, null);
		btnLeite.setBounds(new Rectangle(110, 79, 100, 30));
		this.getContentPane().add(btnLeite, null);
		btnLeite.addActionListener (new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Chamada ao Procedimento
			}});

		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				aoFechar();
			}
		});
	}

	private void aoFechar() {
		System.exit(0);
	}

	public static void main(String args[]) {
		(new Principal()).show();
	}
}*/