import br.ucb.modelo.bem.Imovel;
import br.ucb.modelo.bem.Veiculo;
import br.ucb.modelo.pessoa.Pessoa;
import br.ucb.modelo.pessoa.PessoaFisica;
import br.ucb.modelo.renda.FonteRenda;
import br.ucb.modelo.tipo.FonteRendaEnum;
import br.ucb.modelo.tipo.ImovelEnum;

public class Principal {
	
	public static void main(String args[]) {
		Pessoa pessoa = new PessoaFisica();
		
		pessoa.adicionarBem(new Veiculo(70000, pessoa, "Ford Scorty", Veiculo.CARRO));
		pessoa.adicionarBem(new Imovel(300000, pessoa, "Cidade de Deus", ImovelEnum.CASA));
		
		pessoa.adicionarFonteRenda(new FonteRenda(1000, 100, FonteRendaEnum.SALARIO));
		
		System.out.println("Bens............. "+ pessoa.calcularTotalBens());
		System.out.println("Valor Recebido... "+ pessoa.calcularValorRecebido());
		System.out.println("Imposto Pago..... "+ pessoa.calcularImpostoPago());
		System.out.println("Imposto Devido... "+ pessoa.calcularImpostoDevido());
	}

}
