package com.javacode.estruturadados.labs;

import com.javacode.estruturadados.vetor.Lista;

public class Exercicio04 {

	public static void main(String[] args) {
		Lista<String> listaString = new Lista<String>(5);
		listaString.adiciona("A");
		listaString.adiciona("B");
		listaString.adiciona("C"); // deletar esse elemento
		listaString.adiciona("D");
		listaString.adiciona("E");

		
		System.out.println(listaString);
		
		String resultado = listaString.obtem(0);
		System.out.println(resultado);
		
		String resultado1 = listaString.obtem(1);
		System.out.println(resultado1);
		
		String resultado2 = listaString.obtem(2);
		System.out.println(resultado2);
		
		String resultado3 = listaString.obtem(3);
		System.out.println(resultado3);
		
		String resultado4 = listaString.obtem(4);
		System.out.println(resultado4);
		
		String resultado5 = listaString.obtem(5);
		System.out.println(resultado5);

	}

}
