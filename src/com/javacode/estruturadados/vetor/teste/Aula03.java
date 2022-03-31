package com.javacode.estruturadados.vetor.teste;

import com.javacode.estruturadados.vetor.Vetor;

public class Aula03 {

	public static void main(String[] args) {
		Vetor vetor = new Vetor(2);

		boolean validar = vetor.adiciona("Janeiro");
		boolean validar2 = vetor.adiciona("Fevereiro");
		boolean validar3 = vetor.adiciona("<Março");

		System.out.println(validar + ", " +  validar2  + ", " + validar3);
	}
}
