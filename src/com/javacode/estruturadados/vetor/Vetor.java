package com.javacode.estruturadados.vetor;

public class Vetor {

	private String[] elementos;

	private int tamanho;

	public Vetor(int capacidade) {
		this.elementos = new String[capacidade];
		this.tamanho = 0;
	}

	public boolean adiciona(String elemento) {
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

	public int busca(String elemento) {
		for (int i = 0; i < this.tamanho; i++) {
			if (this.elementos[i].equals(elemento)) {
				return i;
			}
		}

		return -1; // posição não existe dentro do vetor
	}

	public boolean adiciona(int posicao, String elemento) {
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

	private void aumentaCapacidade() {

		if (this.tamanho == this.elementos.length) {
			String[] elementosNovos = new String[this.elementos.length * 2];
			for (int index = 0; index < elementos.length; index++) {
				elementosNovos[index] = this.elementos[index];
			}

			this.elementos = elementosNovos;
		}
	}
}
