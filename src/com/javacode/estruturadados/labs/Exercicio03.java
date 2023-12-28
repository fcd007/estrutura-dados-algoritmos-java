package com.javacode.estruturadados.labs;

import com.javacode.estruturadados.vetor.Lista;

public class Exercicio03 {

	public static void main(String[] args) {
		Lista<String> listaString = new Lista<String>(5);
		listaString.adiciona("A");
		listaString.adiciona("B");
		listaString.adiciona("C"); // deletar esse elemento
		listaString.adiciona("D");
		listaString.adiciona("E");

		System.out.println(listaString);

		listaString.remove("A");
		
		System.out.println(listaString);
		
		listaString.remove("C");
		
		System.out.println(listaString);
		
		listaString.remove("E");
		
		System.out.println(listaString);

	}

}
