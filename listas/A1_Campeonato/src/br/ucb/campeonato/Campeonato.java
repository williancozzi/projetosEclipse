package br.ucb.campeonato;

import java.io.Serializable;

public class Campeonato implements Serializable {
	private static final long serialVersionUID = 1L;
	private String nome;
	private Time times[];
	private int qtdTimes;
	private Jogo jogos[];
	private int qtdJogos;
	private Time vencedor;
	
	public Campeonato() {
		this.times = new Time[20];
		this.jogos = new Jogo[380];
	}

	public Campeonato(String nome) {
		this();
		this.nome = nome;
	}
	
	public boolean cadastrarTime(String nome) {
		if (this.qtdTimes == 20)
			return false;
		this.times[this.qtdTimes++] = new Time(nome);
		return true;
	}
	
	public void listarTimes() {
		for (int i=0; i<this.qtdTimes; i++)
			System.out.println("--> Nome: "+ this.times[i].getNome() + ", pontos: "+ this.times[i].getPontos() + ", vitórias: "+ this.times[i].getVitorias() + ", saldo: "+ this.times[i].getSaldoGols() + ", gols pró: "+ this.times[i].getGolsPro() );
	}
	
	public boolean cadastrarJogo(String cidade, String time1, int golsTime1, String time2, int golsTime2) {
		Time t1 = this.buscarTime(time1);
		Time t2 = this.buscarTime(time2);
		if ((this.qtdJogos == 380) || (t1 == null) || (t2 == null))
			return false;
		Jogo jogo = new Jogo(cidade, t1, golsTime1, t2, golsTime2); 
		this.jogos[this.qtdJogos++] = jogo;
		t1.apurar(jogo);
		t2.apurar(jogo);
		return true;
	}
	
	public void listarJogos() {
		for (int i=0; i<this.qtdJogos; i++)
			System.out.println("--> Cidade: "+ this.jogos[i].getCidade() + ", data: "+ this.jogos[i].getData() + " - "+ this.jogos[i].getTime1().getNome() + " "+ this.jogos[i].getGolsTime1() + " X "+ this.jogos[i].getGolsTime2() +" "+ this.jogos[i].getTime2().getNome() );
	}
	
	public void computarVencedor() {
		if (this.qtdTimes == 0)
			return;
		this.vencedor = this.times[0];
		for (int i=1; i<this.qtdTimes; i++)
			if ( (this.times[i].getPontos() >  this.vencedor.getPontos()) ||
				((this.times[i].getPontos() == this.vencedor.getPontos()) && (this.times[i].getVitorias() >  this.vencedor.getVitorias())) ||
				((this.times[i].getPontos() == this.vencedor.getPontos()) && (this.times[i].getVitorias() == this.vencedor.getVitorias()) && (this.times[i].getSaldoGols() >  this.vencedor.getSaldoGols())) ||
				((this.times[i].getPontos() == this.vencedor.getPontos()) && (this.times[i].getVitorias() == this.vencedor.getVitorias()) && (this.times[i].getSaldoGols() == this.vencedor.getSaldoGols()) && (this.times[i].getGolsPro() > this.vencedor.getGolsPro()))
			)
				this.vencedor = this.times[i]; 
	}
	
	private Time buscarTime(String nome) {
		for (int i=0; i<this.qtdTimes; i++)
			if (nome.equals(this.times[i].getNome()))
				return this.times[i];
		return null;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Time getVencedor() {
		return vencedor;
	}

}
