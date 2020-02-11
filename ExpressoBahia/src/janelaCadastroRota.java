import br.ucb.expressobahia.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class janelaCadastroRota extends JDialog {

	private JTextField txtfieldOrigem = new JTextField("Ex: Salvador");
	private JTextField txtfieldDestino = new JTextField("Ex: Fortaleza");
	private JLabel lblOrigem = new JLabel("Origem");
	private JLabel lblDestino = new JLabel("Destino");
	private JButton btnConfirmaRota = new JButton("Ok");
	private janelaPrincipal janelaPrincipal;
	private Rota rota;
	private String txtOrigem;
	private String txtDestino;
	private ExpressoBahia empresa = new ExpressoBahia();
	private int x;
	
	public janelaCadastroRota() {
		try {
			mostra();
		} catch(Exception ex) {
			ex.printStackTrace();
		}
	}

	public void mostra() throws Exception {

		this.getContentPane().setLayout(null);
		this.getContentPane().setBackground(new Color(238, 238, 238));
		this.setSize(544, 230);
		this.setLocation(444, 328);
		this.setTitle("Cadastro de Rota");
		this.setResizable(false);
		this.setModal(true);

		txtfieldOrigem.setBounds(new Rectangle(75, 83, 100, 21));
		this.getContentPane().add(txtfieldOrigem, null);
		txtfieldDestino.setBounds(new Rectangle(257, 81, 100, 21));
		this.getContentPane().add(txtfieldDestino, null);
		lblOrigem.setBounds(new Rectangle(98, 60, 57, 13));
		this.getContentPane().add(lblOrigem, null);
		lblDestino.setBounds(new Rectangle(280, 61, 57, 13));
		this.getContentPane().add(lblDestino, null);
		btnConfirmaRota.setBounds(new Rectangle(409, 75, 100, 30));
		this.getContentPane().add(btnConfirmaRota, null);
		btnConfirmaRota.addActionListener (new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Chamada ao Procedimento
				txtOrigem = txtfieldOrigem.getText();
				txtDestino = txtfieldDestino.getText(); 
				rota = new Rota(txtOrigem, txtDestino);
				empresa.cadastrarRota(rota);
				fecharAtual();
				(new RotaOk()).show();
				
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