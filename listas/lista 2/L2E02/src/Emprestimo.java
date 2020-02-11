public class Emprestimo {
	public int prazoDevolucao;
	public float multa;
	public int codEmprestimo;
	Livro livro;
	
	public Emprestimo() {
		
	}
	
	public void realizarEmprestimo() {
		if (livro.isDisponivel())
			System.out.println("Empréstimo realizado");
		else
			System.out.println("Livro indisponível");
	}

	public int getPrazoDevolucao() {
		return prazoDevolucao;
	}

	public void setPrazoDevolucao(int prazoDevolucao) {
		this.prazoDevolucao = prazoDevolucao;
	}

	public float getMulta() {
		return multa;
	}

	public void setMulta(float multa) {
		this.multa = multa;
	}

	public int getCodEmprestimo() {
		return codEmprestimo;
	}

	public void setCodEmprestimo(int codEmprestimo) {
		this.codEmprestimo = codEmprestimo;
	}
	
}
