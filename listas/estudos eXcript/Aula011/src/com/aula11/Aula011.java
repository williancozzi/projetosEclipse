package com.aula11;
public class Aula011 {
	public static void main(String[] args) {
		
		Visitante v1 = new Visitante();
		v1.setNome("Juveval");
		v1.setIdade(22);
		v1.setSexo("M");
		System.out.println(v1.toString());
		
		Aluno a1 = new Aluno();
		a1.setNome("Claudio");
		a1.setMatricula(1111);
		a1.setCurso("Informatica");
		a1.setIdade(16);
		a1.setSexo("M");
		a1.pagarMensal();
		System.out.println(a1.toString());
		
		Bolsista b1 = new Bolsista();
		b1.setMatricula(2122);
		b1.setNome("Joao");
		b1.setIdade(32);
		b1.setBolsa(12.5f);
		b1.setSexo("M");
		b1.pagarMensal();
		System.out.println(b1.toString());
		
	}
	

}
