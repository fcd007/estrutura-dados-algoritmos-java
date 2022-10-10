package com.javacode.estruturadados.vetor.teste;

import com.javacode.estruturadados.vetor.Vetor;

public class aula07 {
	
	public static void main(String[] args) {
		Vetor vetor = new Vetor(10);
		
		vetor.adiciona("B");
		vetor.adiciona("C");
		vetor.adiciona("E");
		vetor.adiciona("F");
		vetor.adiciona("G");
		
		vetor.adiciona(5, "A");
		
		System.out.println(vetor.toString());
	}

}
