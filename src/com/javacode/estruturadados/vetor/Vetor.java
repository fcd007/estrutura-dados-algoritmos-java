package com.javacode.estruturadados.vetor;

public class Vetor {

	private String[] elementos;

	private int tamanho;

	public Vetor(int capacidade) {
		this.elementos = new String[capacidade];
		this.tamanho = 0;
	}

	/**
	 * Algorimo de adiciona elemento no array de Strings op��o 1
	 * 
	 * @throws Exception
	 */
//	public void adiciona(String elemento) {
//		for(int i = 0; i < this.elementos.length; i++) {
//			if(this.elementos[i] == null) {
//				this.elementos[i] = elemento;
//				//usamos para frear o loop do for.
//				break;
//			}
//		}
//	}

	public boolean adiciona(String elemento) {
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

	public int busca(String elemento) {
		for (int i = 0; i < this.tamanho; i++) {
			if (this.elementos[i].equals(elemento)) {
				return i;
			}
		}

		return -1; //posição não existe dentro do vetor
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
