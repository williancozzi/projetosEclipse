public class Pessoa {
	public String nome;
	Emprestimo emprestimo;
	Livro livro;
	
	public Pessoa() {
		
	}
	
	public void pegarLivro() {
		emprestimo.realizarEmprestimo();
	}
	
	public void devolverLivro() {
		
	}
	
	public void pagarMulta() {
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
