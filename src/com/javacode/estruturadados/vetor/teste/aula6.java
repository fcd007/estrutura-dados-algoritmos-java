package com.javacode.estruturadados.vetor.teste;

import com.javacode.estruturadados.vetor.Vetor;

public class aula6 {

	public static void main(String[] args) {

		Vetor vetor = new Vetor(10);

		vetor.adiciona("Janeiro");
		vetor.adiciona("Fevereiro");
		vetor.adiciona("Marco");
		vetor.adiciona("Abril");
		
		System.out.println(vetor.busca("Janeiros"));
	}

}
