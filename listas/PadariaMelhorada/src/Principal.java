import br.ucb.padariamelhorada.*;

// Importa os pacotes necessários
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Principal extends JFrame {

	  private JLabel lblP1 = new JLabel("Padeiro 1");
	  private JLabel lvlP2 = new JLabel("Padeiro 2");
	  private JLabel lblP3 = new JLabel("Padeiro 3");
	  private JButton btnFz1 = new JButton("Fazer pão");
	  private JButton btnFz2 = new JButton("Fazer pão");
	  private JButton btnFz3 = new JButton("Fazer pão");
	  private JButton btnBotijao = new JButton("Trocar botijão");
	  private JComboBox menu1 = new JComboBox();
	  private JLabel lblGerente = new JLabel("Gerente");
	  private JComboBox objeto12 = new JComboBox();
	  private JComboBox objeto13 = new JComboBox();

  public Principal() {
    try {
      mostra();
    } catch(Exception ex) {
      ex.printStackTrace();
    }
  }

  public void mostra() throws Exception {

	    this.getContentPane().setLayout(null);
	    this.getContentPane().setBackground(new Color(238, 238, 238));
	    this.setSize(586, 228);
	    this.setLocation(-1216, 259);
	    this.setTitle("Cafeteira - Versão 1.09 - Java");
	    this.setResizable(false);

	    lblP1.setBounds(new Rectangle(36, 56, 70, 13));
	    this.getContentPane().add(lblP1, null);
	    lvlP2.setBounds(new Rectangle(35, 100, 57, 13));
	    this.getContentPane().add(lvlP2, null);
	    lblP3.setBounds(new Rectangle(34, 148, 57, 13));
	    this.getContentPane().add(lblP3, null);
	    btnFz1.setBounds(new Rectangle(110, 47, 100, 30));
	    this.getContentPane().add(btnFz1, null);
	    btnFz1.addActionListener (new ActionListener() {
	      public void actionPerformed(ActionEvent e) {
	        // Chamada ao Procedimento
	    }});
	    btnFz2.setBounds(new Rectangle(111, 91, 100, 30));
	    this.getContentPane().add(btnFz2, null);
	    btnFz2.addActionListener (new ActionListener() {
	      public void actionPerformed(ActionEvent e) {
	        // Chamada ao Procedimento
	    }});
	    btnFz3.setBounds(new Rectangle(111, 133, 100, 30));
	    this.getContentPane().add(btnFz3, null);
	    btnFz3.addActionListener (new ActionListener() {
	      public void actionPerformed(ActionEvent e) {
	        // Chamada ao Procedimento
	    }});
	    btnBotijao.setBounds(new Rectangle(446, 36, 120, 30));
	    this.getContentPane().add(btnBotijao, null);
	    btnBotijao.addActionListener (new ActionListener() {
	      public void actionPerformed(ActionEvent e) {
	        // Chamada ao Procedimento
	    }});
	    menu1.setBounds(new Rectangle(225, 47, 190, 25));
	    this.getContentPane().add(menu1, null);
	    lblGerente.setBounds(new Rectangle(486, 17, 57, 13));
	    this.getContentPane().add(lblGerente, null);
	    objeto12.setBounds(new Rectangle(227, 94, 190, 25));
	    this.getContentPane().add(objeto12, null);
	    objeto13.setBounds(new Rectangle(227, 137, 190, 25));
	    this.getContentPane().add(objeto13, null);

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
}