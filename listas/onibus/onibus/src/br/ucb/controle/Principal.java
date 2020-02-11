package br.ucb.controle;

import br.ucb.modelo.Empresa;
import br.ucb.modelo.Rota;
import br.ucb.visao.FrmPrincipal;
import br.ucb.visao.FrmRotas;

public class Principal {
	private FrmPrincipal frmPrincipal;
	private FrmRotas frmRotas;
	private Empresa empresa;
	
	public Principal() {
		this.frmPrincipal = new FrmPrincipal(this);
		this.frmRotas = new FrmRotas(this);
		this.empresa = new Empresa();
	}
	
	public static void main(String args[]) {
		Principal controlador = new Principal();

		controlador.frmPrincipal.setVisible(true);
	}
	
	public void mostrarFrmRota() {
		frmRotas.setVisible(true);
	}
	
	public void adicionarRota(String cidadeOrigem, String ufOrigem, String cidadeDestino, String ufDestino) {
		this.empresa.adicionarRota(new Rota(cidadeOrigem, ufOrigem, cidadeDestino, ufDestino));
		
		System.out.println("--> "+ this.empresa.getRota(0).toString());
	}
	

}
