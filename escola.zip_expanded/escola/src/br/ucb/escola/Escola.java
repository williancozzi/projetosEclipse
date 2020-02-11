package br.ucb.escola;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Escola implements Serializable {
	private static final long serialVersionUID = 1L;
	private List<Usuario> usuarios;
	
	public Escola() {
		this.usuarios = new ArrayList<Usuario>();
		this.usuarios.add(new Diretor("diretor", "123"));
	}
	
	public Usuario logar(String login, String senha) {
		for (Usuario usuario : this.usuarios)
			if ((usuario.getLogin().equals(login)) && (usuario.logar(senha)))
				return usuario;
		return null;
	}
	
	public boolean cadastrar(Usuario usuario, Usuario diretor) {
		if (!diretor.getClass().getSimpleName().equals("Diretor"))
			return false;
		this.usuarios.add(usuario);
		return true;
	}
	
	
	
	

}
