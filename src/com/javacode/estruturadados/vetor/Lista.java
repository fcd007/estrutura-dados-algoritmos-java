package com.javacode.estruturadados.vetor;

import java.lang.reflect.Array;

public class Lista<T> {

	private T[] elementos;

	private int tamanho;

	public Lista(int capacidade) {
		this.elementos = (T[]) new Object[capacidade];
		this.tamanho = 0;
	}

	public Lista(int capacidade, Class<T> tipoClasse) {
		this.elementos = (T[]) Array.newInstance(tipoClasse, capacidade);
		this.tamanho = 0;
	}

	public boolean adiciona(T elemento) {
		aumentaCapacidade();

		if (this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
			return true;
		}
		return false;
	}

	public int tamanho() {
		return this.tamanho;
	}

	public T busca(int posicao) {

		if (!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posicao invalida");
		}

		return this.elementos[posicao];
	}

	public int busca(T elemento) {
		for (int i = 0; i < this.tamanho; i++) {
			if (this.elementos[i].equals(elemento)) {
				return i;
			}
		}

		return -1; // posição não existe dentro do vetor
	}

	public T obtem(int posicao) {
		return busca(posicao);
	}

	public boolean contem(T elemento) {
		return busca(elemento) > -1;
	}

	public boolean adiciona(int posicao, T elemento) {
		// adicionar elemento na primeira posiçao do vetor vetor[0] = "A"
		if (!(posicao >= 0 && posicao <= tamanho)) {
			throw new IllegalArgumentException("Posicao invalida");
		}

		aumentaCapacidade();
		// mover todos os elementos
		for (int i = this.tamanho - 1; i >= posicao; i--) {
			this.elementos[i + 1] = this.elementos[i];
		}

		this.elementos[posicao] = elemento;
		this.tamanho++;

		return false;
	}

	private void aumentaCapacidade() {

		if (this.tamanho == this.elementos.length) {
			T[] elementosNovos = (T[]) new Object[this.elementos.length * 2];
			for (int index = 0; index < elementos.length; index++) {
				elementosNovos[index] = this.elementos[index];
			}

			this.elementos = elementosNovos;
		}
	}

	/**
	 * 
	 * @param elemento
	 * @return int posicao do elemento encontrado como ultimo indice
	 */
	public int ultimoIndice(T elemento) {
		int ultimaPosicao = -1;

		for (int i = this.tamanho - 1; i >= 0; i--) {
			if (this.elementos[i].equals(elemento)) {
				return i;
			}
		}

		return ultimaPosicao;
	}

	public void remove(int posicao) {
		if (!(posicao >= 0 && posicao < tamanho)) {

			throw new IllegalArgumentException("Posicao invalida");
		}

		for (int i = posicao; i < this.tamanho - 1; i++) {
			this.elementos[i] = this.elementos[i + 1];
		}

		this.tamanho--;
	}

	public void remove(T elemento) {
		int posicao = this.busca(elemento);
		if (posicao > -1) {
			this.remove(posicao);
		}
	}

	/**
	 * @param T elemento
	 * @return T Elemento
	 */
	public T removeElemento(T elemento) {

		return elemento;
	}

	@Override
	public String toString() {
		StringBuilder string = new StringBuilder();
		string.append("[");

		for (int i = 0; i < this.tamanho - 1; i++) {
			string.append(elementos[i]);
			string.append(", ");
		}

		if (this.tamanho > 0) {
			string.append(this.elementos[this.tamanho - 1]);
		}

		string.append("]");

		return string.toString();
	}
}
