package com.javacode.estruturadados.vetor.teste;

import com.javacode.estruturadados.vetor.Lista;

public class AulaTeste11 {
	public static void main(String[] args) {
		Lista<String> vetor = new Lista(2);
		
		vetor.adiciona("Teste de strings");
		
		System.out.println(vetor.toString());
		
	}
}
