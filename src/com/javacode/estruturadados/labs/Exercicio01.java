package com.javacode.estruturadados.labs;

import com.javacode.estruturadados.vetor.Lista;

public class Exercicio01 {
	public static void main(String[] args) {
		Lista<String> lista = new Lista<>(5);
		
		lista.adiciona("A");
		lista.adiciona("B");
		lista.adiciona("C");
		lista.adiciona("F");
		lista.adiciona("G");
		
		System.out.println(lista.contem("D"));
		System.out.println(lista.contem("A"));
		System.out.println(lista.contem("B"));
		System.out.println(lista.contem("C"));
		System.out.println(lista.contem("F"));
		System.out.println(lista.contem("G"));
		System.out.println(lista.contem("H"));
	}

}
