import java.util.ArrayList;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Main extends JFrame {

	private JLabel objeto0 = new JLabel("Add Conta");
	private JButton objeto1 = new JButton("OK");

	public Main() {
		try {
			mostra();
		} catch(Exception ex) {
			ex.printStackTrace();
		}
	}

	public void mostra() throws Exception {

		this.getContentPane().setLayout(null);
		this.getContentPane().setBackground(new Color(238, 238, 238));
		this.setSize(336, 230);
		this.setLocation(-970, 473);
		this.setTitle("Pessoa");
		this.setResizable(false);


		objeto0.setBounds(new Rectangle(136, 64, 100, 13));
		this.getContentPane().add(objeto0, null);
		objeto1.setBounds(new Rectangle(112, 122, 100, 30));
		this.getContentPane().add(objeto1, null);
		objeto1.addActionListener (new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Chamada ao Procedimento
				Pessoa p1 = new Pessoa("joao");
				Conta cc = new Conta(222);
				ArrayList<Conta> contas = new ArrayList<>();
				for (int i = 0; i < contas.size(); i++) {
					System.out.println(contas.get(i).getSaldo());
				}


			}
		});

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
		(new Main()).show();
}}
