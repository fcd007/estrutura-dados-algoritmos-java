package com.javacode.estruturadados.vetor.teste;

import com.javacode.estruturadados.vetor.Vetor;

public class Aula04 {

	public static void main(String[] args) {
		
		Vetor vetor = new Vetor(10);
		
		vetor.adiciona("Janeiro");
		vetor.adiciona("Fevereiro");
		vetor.adiciona("Março");
		vetor.adiciona("Abril");
		
		System.out.println(vetor.tamanho());
		//chamada para o toString
		System.out.println(vetor);
	}

}
