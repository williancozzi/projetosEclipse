package br.ucb.cafeteira;

import java.awt.Color;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class FrmRotas extends JFrame {
	// Objetos da Janela (bloco 1)
	private JLabel lblCidadePartida = new JLabel("Cidade partida");
	private JTextField edtCidadePartida = new JTextField();
	private JLabel lblUfPartida = new JLabel("UF partida");
	private JComboBox cbUfPartida = new JComboBox();
	private JLabel lblCidadeChegada = new JLabel("Cidade chegada");
	private JTextField edtCidadeChegada = new JTextField();
	private JLabel lblUfChegada = new JLabel("UF chegada");
	private JComboBox cbUfChegada = new JComboBox();
	private JButton btnVoltar = new JButton("<");
	private JButton btnNovo = new JButton("+");
	private JButton btnSalvar = new JButton("S");
	private JButton btnIr = new JButton(">");
	private JLabel lblPosicao = new JLabel("0/0");
	private JButton btnRemover = new JButton("-");
	private JButton btnEditar = new JButton("E");


	public FrmRotas() {
		try {
			mostra();
		} catch(Exception ex) {
			ex.printStackTrace();
		}
	}

	public void mostra() throws Exception {
		// Dados da Janela (bloco 2)
		this.getContentPane().setLayout(null);
		this.getContentPane().setBackground(new Color(238, 238, 238));
		this.setSize(360, 180);
		this.setLocation(600, 320);
		this.setTitle("Rotas");
		this.setResizable(false);

		// Cria os Objetos na Janela (bloco 3)
		lblCidadePartida.setBounds(new Rectangle(10, 10, 100, 13));
		this.getContentPane().add(lblCidadePartida, null);
		edtCidadePartida.setBounds(new Rectangle(10, 25, 250, 21));
		this.getContentPane().add(edtCidadePartida, null);
		lblUfPartida.setBounds(new Rectangle(270, 10, 100, 13));
		this.getContentPane().add(lblUfPartida, null);
		cbUfPartida.setBounds(new Rectangle(270, 25, 75, 20));
		this.getContentPane().add(cbUfPartida, null);
		lblCidadeChegada.setBounds(new Rectangle(10, 60, 150, 13));
		this.getContentPane().add(lblCidadeChegada, null);
		edtCidadeChegada.setBounds(new Rectangle(10, 75, 250, 21));
		this.getContentPane().add(edtCidadeChegada, null);
		lblUfChegada.setBounds(new Rectangle(270, 60, 150, 13));
		this.getContentPane().add(lblUfChegada, null);
		cbUfChegada.setBounds(new Rectangle(270, 75, 75, 20));
		this.getContentPane().add(cbUfChegada, null);
		btnVoltar.setBounds(new Rectangle(10, 110, 45, 30));
		this.getContentPane().add(btnVoltar, null);
		btnVoltar.addActionListener (new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Chamada ao Procedimento
			}});
		btnNovo.setBounds(new Rectangle(110, 110, 45, 30));
		this.getContentPane().add(btnNovo, null);
		btnNovo.addActionListener (new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Chamada ao Procedimento
			}});
		btnSalvar.setBounds(new Rectangle(250, 110, 45, 30));
		this.getContentPane().add(btnSalvar, null);
		btnSalvar.addActionListener (new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Chamada ao Procedimento
			}});
		btnIr.setBounds(new Rectangle(300, 110, 45, 30));
		this.getContentPane().add(btnIr, null);
		btnIr.addActionListener (new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Chamada ao Procedimento
			}});
		lblPosicao.setBounds(new Rectangle(155, 120, 45, 13));
		this.getContentPane().add(lblPosicao, null);
		btnRemover.setBounds(new Rectangle(60, 110, 45, 30));
		this.getContentPane().add(btnRemover, null);
		btnRemover.addActionListener (new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Chamada ao Procedimento
			}});
		btnEditar.setBounds(new Rectangle(200, 110, 45, 30));
		this.getContentPane().add(btnEditar, null);
		btnEditar.addActionListener (new ActionListener() {
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
		(new FrmRotas()).show();
	}
	
}	