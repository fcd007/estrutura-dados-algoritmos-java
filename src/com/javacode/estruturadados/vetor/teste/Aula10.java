package com.javacode.estruturadados.vetor.teste;

import com.javacode.estruturadados.vetor.VetorObject;

public class Aula10 {

	public static void main(String[] args) {
		VetorObject vetor = new VetorObject(3);

		vetor.adiciona(3);
		vetor.adiciona(2);
		vetor.adiciona(1);

		System.out.println("Tamnanho = " + vetor.tamanho());

		System.out.format("Vetor %s", vetor);
	}

}
