package com.javacode.estruturadados.labs;

import java.util.ArrayList;
import java.util.List;

import com.javacode.estruturadados.vetor.Lista;

public class Exercicio02 {

	public static void main(String[] args) {
		Lista<String> listaString = new Lista<>(10);
		listaString.adiciona("A");
		listaString.adiciona("B");
		listaString.adiciona("C");
		listaString.adiciona("F");
		listaString.adiciona("G");

		int ultimoIndice = listaString.ultimoIndice();
		System.out.println("O último indice do array string é = " + ultimoIndice);

		List<String> lista = new ArrayList<>();

		lista.add("A");
		lista.add("B");
		if (lista.size() != 0) {
			int ultimoIndiceArrayList = lista.lastIndexOf("A");
			System.out.println("O último indice do ArrayList string é = " + ultimoIndiceArrayList);
		}
	}

}
