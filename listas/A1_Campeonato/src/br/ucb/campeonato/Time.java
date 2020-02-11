package br.ucb.campeonato;

import java.io.Serializable;

public class Time implements Serializable {
	private static final long serialVersionUID = 1L;
	private String nome;
	private int pontos;
	private int vitorias;
	private int saldoGols;
	private int golsPro;

	public Time() {
	}

	public Time(String nome) {
		this.nome = nome;
	}

	public void apurar(Jogo jogo) {
		if (this == jogo.getTime1()) {
			if (jogo.getGolsTime1() > jogo.getGolsTime2()) {
				this.pontos += 3;
				this.vitorias++;
			}
			else
				if (jogo.getGolsTime1() == jogo.getGolsTime2())
					this.pontos++;
			this.golsPro += jogo.getGolsTime1();
			this.saldoGols += jogo.getGolsTime1() - jogo.getGolsTime2();
		}
		else {
			if (this == jogo.getTime2()) {
				if (jogo.getGolsTime2() > jogo.getGolsTime1()) {
					this.pontos += 3;
					this.vitorias++;
				}
				else
					if (jogo.getGolsTime2() == jogo.getGolsTime1())
						this.pontos++;
				this.golsPro += jogo.getGolsTime2();
				this.saldoGols += jogo.getGolsTime2() - jogo.getGolsTime1();
			}
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getPontos() {
		return pontos;
	}

	public int getVitorias() {
		return vitorias;
	}

	public int getSaldoGols() {
		return saldoGols;
	}

	public int getGolsPro() {
		return golsPro;
	}

}
