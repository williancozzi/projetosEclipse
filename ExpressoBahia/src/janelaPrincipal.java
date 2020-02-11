import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import br.ucb.expressobahia.*;

public class janelaPrincipal extends JDialog {

	private JLabel lblCadastrarRota = new JLabel("Cadastrar Rota");
	private JLabel lblSaida = new JLabel("Cadastrar Saida");
	private JLabel lblPassagem = new JLabel("Vender Passagem");
	private JButton btnRota = new JButton("Ok");
	private JButton btnSaida = new JButton("Ok");
	private JButton btnVender = new JButton("Ok");
	private janelaCadastroRota janelaRotas; 
	private ExpressoBahia empresa = new ExpressoBahia();
	
	public janelaPrincipal() {
		try {
			mostra();
		} catch(Exception ex) {
			ex.printStackTrace();
		}
	}

	public void mostra() throws Exception {

		this.getContentPane().setLayout(null);
		this.getContentPane().setBackground(new Color(238, 238, 238));
		this.setSize(597, 281);
		this.setLocation(291, 108);
		this.setTitle("Expresso Bahia");
		this.setResizable(false);
		this.setModal(true);

		lblCadastrarRota.setBounds(new Rectangle(51, 78, 93, 13));
		this.getContentPane().add(lblCadastrarRota, null);
		lblSaida.setBounds(new Rectangle(238, 76, 98, 17));
		this.getContentPane().add(lblSaida, null);
		lblPassagem.setBounds(new Rectangle(413, 79, 119, 13));
		this.getContentPane().add(lblPassagem, null);
		btnSaida.setBounds(new Rectangle(239, 119, 100, 30));
		this.getContentPane().add(btnSaida, null);
		btnSaida.addActionListener (new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Chamada ao Procedimento
			}});
		btnVender.setBounds(new Rectangle(415, 119, 100, 30));
		this.getContentPane().add(btnVender, null);
		btnVender.addActionListener (new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Chamada ao Procedimento
			}});
		lblCadastrarRota.setBounds(new Rectangle(51, 78, 93, 13));
		this.getContentPane().add(lblCadastrarRota, null);
		lblSaida.setBounds(new Rectangle(238, 76, 98, 17));
		this.getContentPane().add(lblSaida, null);
		lblPassagem.setBounds(new Rectangle(413, 79, 119, 13));
		this.getContentPane().add(lblPassagem, null);
		btnRota.setBounds(new Rectangle(48, 119, 100, 30));
		this.getContentPane().add(btnRota, null);
		btnRota.addActionListener (new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Chamada ao Procedimento
				fecharAtual();
				(new janelaCadastroRota()).show();

			}});
		btnSaida.setBounds(new Rectangle(239, 119, 100, 30));
		this.getContentPane().add(btnSaida, null);
		btnVender.setBounds(new Rectangle(415, 119, 100, 30));
		this.getContentPane().add(btnVender, null);

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