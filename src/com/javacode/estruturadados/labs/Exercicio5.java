package com.javacode.estruturadados.labs;

import com.javacode.estruturadados.vetor.Lista;

public class Exercicio5 {

	public static void main(String[] args) {
		Lista<String> listaString = new Lista<String>(5);
		listaString.adiciona("A");
		listaString.adiciona("B");
		listaString.adiciona("C");
		listaString.adiciona("D");
		listaString.adiciona("E");

		
		System.out.println(listaString);
		listaString.limpar();
		System.out.println(listaString);

	}

}
