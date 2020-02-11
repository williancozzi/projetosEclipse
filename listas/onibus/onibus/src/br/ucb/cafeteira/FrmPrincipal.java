package br.ucb.cafeteira;

import java.awt.Color;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class FrmPrincipal extends JFrame {
	// Objetos da Janela (bloco 1)
	private JLabel lblEmpresa = new JLabel("Empresa de �nibus...");
	private JButton btnRotas = new JButton("Rotas");
	private JButton btnSaidas = new JButton("Sa�das");
	private JButton btnPassagens = new JButton("Passagens");

	public FrmPrincipal() {
		try {
			mostra();
		} catch(Exception ex) {
			ex.printStackTrace();
		}
	}

	public void mostra() throws Exception {
		// Dados da Janela (bloco 2)
		lblEmpresa.setBounds(new Rectangle(1, 1, 337, 185));
		this.getContentPane().add(lblEmpresa, null);
		this.getContentPane().setLayout(null);
		this.getContentPane().setBackground(new Color(238, 238, 238));
		this.setSize(345, 270);
		this.setLocation(440, 220);
		this.setTitle("Empresa de �nibus");
		this.setResizable(false);

		// Cria os Objetos na Janela (bloco 3)
		btnRotas.setBounds(new Rectangle(10, 200, 100, 30));
		this.getContentPane().add(btnRotas, null);
		btnRotas.addActionListener (new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Chamada ao Procedimento
			}});
		
		btnSaidas.setBounds(new Rectangle(120, 200, 100, 30));
		this.getContentPane().add(btnSaidas, null);
		btnSaidas.addActionListener (new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Chamada ao Procedimento
			}});

		btnPassagens.setBounds(new Rectangle(230, 200, 100, 30));
		this.getContentPane().add(btnPassagens, null);
		btnPassagens.addActionListener (new ActionListener() {
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
		(new FrmPrincipal()).show();
	}

}
