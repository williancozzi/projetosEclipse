
import br.ucb.expressobahia.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RotaOk extends JDialog {

	private JLabel lblOrigem = new JLabel("Rota adicionada com sucesso!");
	private JButton btnVoltarMenu = new JButton("Voltar ao Menu");

	public RotaOk() {
		try {
			mostrarRotaOk();
		} catch(Exception ex) {
			ex.printStackTrace();
		}
	}

	public void mostrarRotaOk() throws Exception {

		this.getContentPane().setLayout(null);
		this.getContentPane().setBackground(new Color(204, 204, 204));
		this.setSize(336, 230);
		this.setLocation(-1057, 348);
		this.setTitle("Rota Adicionada");
		this.setResizable(false);
		this.setModal(true);

		lblOrigem.setBounds(new Rectangle(82, 32, 300, 13));
		this.getContentPane().add(lblOrigem, null);
		btnVoltarMenu.setBounds(new Rectangle(98, 139, 150, 30));
		this.getContentPane().add(btnVoltarMenu, null);
		btnVoltarMenu.addActionListener (new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fecharAtual();
				(new janelaPrincipal()).show();

			}});

			this.addWindowListener(new WindowAdapter() {
				public void windowClosing(WindowEvent e) {
					aoFechar();
				}
			});
	}

	private void fecharAtual() {
		//setVisible(false);
		//this.dispose();
		this.hide();
	}

	private void aoFechar() {
		System.exit(0);
	}

}