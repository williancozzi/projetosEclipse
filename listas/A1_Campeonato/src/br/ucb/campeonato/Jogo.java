package br.ucb.campeonato;

import java.io.Serializable;
import java.util.Date;

public class Jogo implements Serializable {
	private static final long serialVersionUID = 1L;
	private String cidade;
	private Date data;
	private Time time1;
	private int golsTime1;
	private Time time2;
	private int golsTime2;
	
	public Jogo() {
	}

	public Jogo(String cidade, Time time1, int golsTime1, Time time2, int golsTime2) {
		this.cidade = cidade;
		this.data = new Date();
		this.time1 = time1;
		this.golsTime1 = golsTime1;
		this.time2 = time2;
		this.golsTime2 = golsTime2;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Time getTime1() {
		return time1;
	}

	public int getGolsTime1() {
		return golsTime1;
	}

	public Time getTime2() {
		return time2;
	}

	public int getGolsTime2() {
		return golsTime2;
	}

}
