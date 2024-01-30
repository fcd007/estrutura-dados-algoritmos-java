package com.javacode.estruturadados.labs;

import java.util.ArrayList;
import java.util.Scanner;

import com.javacode.estruturadados.entidade.Contato;

public class Exercicio07 extends Exercicio06 {

	public static void main(String[] args) {
		// criação das variaáveis
		Scanner scan = new Scanner(System.in);

		// criar um vetor com 20 de capacidade
		ArrayList<Contato> lista = new ArrayList<Contato>(20);

		// criar e adicionar 320 contatos
		criarContatosDinamicamenter(5, lista);

		// criar um menu para qu eo usuário escolha a opção
		int opcao = 1;

		while (opcao != 0) {
			opcao = obterOpcaoMenu(scan);

			switch (opcao) {
			case 1: {
				adicionarContatoFinal(scan, lista);
				break;
			}
			case 2: {
				adicionarContatoPosicao(scan, lista);
				break;
			}
			case 3: {
				obtemContatoPosicao(scan, lista);
				break;
			}
			case 4: {
				obtemContato(scan, lista);
				break;
			}
			case 5: {
				pesquisarUltimoIndiceContato(scan, lista);
				break;
			}
			case 6: {
				pesquisarUContatoExiste(scan, lista);
				break;
			}
			case 7: {
				excluirPorPosicao(scan, lista);
				break;
			}
			case 8: {
				excluirContato(scan, lista);
				break;
			}
			case 9: {
				imprimeTamanhoDoVetor(lista);
				break;
			}
			case 10: {
				limparTodosOsContatos(lista);
				break;
			}
			case 11: {
				imprimeContatos(lista);
				break;
			}

			default:
				throw new IllegalArgumentException("Unexpected value: " + opcao);
			}
		}
	}

	private static void adicionarContatoFinal(Scanner scan, ArrayList<Contato> lista) {
		System.out.println("Criando um contato, entre com as informações: ");
		String nome = lerInformcao("Entre com o nome: ", scan);
		String telefone = lerInformcao("Entre com o telefone: ", scan);
		String email = lerInformcao("Entre com o email: ", scan);

		Contato contato = new Contato(nome, email, telefone);

		lista.add(contato);

		System.out.println("Contato adicionado com sucesso");
		System.out.println(contato);
	}

	private static void adicionarContatoPosicao(Scanner scan, ArrayList<Contato> lista) {
		System.out.println("Criando um contato, entre com as informações: ");
		String nome = lerInformcao("Entre com o nome: ", scan);
		String telefone = lerInformcao("Entre com o telefone: ", scan);
		String email = lerInformcao("Entre com o email: ", scan);

		Contato contato = new Contato(nome, email, telefone);

		int posicaoInsercao = lerInformacaoInt(email, scan);

		try {
			lista.add(posicaoInsercao, contato);
			System.out.println("Contato adicionado com sucesso.");
			System.out.println(contato);
		} catch (Exception e) {
			System.out.println("Não adicionado");
		}

		System.out.println("Contato adicionado com sucesso");
		System.out.println(contato.toString());
	}

	private static void obtemContatoPosicao(Scanner scan, ArrayList<Contato> lista) {
		int posicaoContato = lerInformacaoInt("Entre com a posição a ser pesquisada: ", scan);

		try {
			Contato contato = lista.get(posicaoContato);
			System.out.println("Contato existe, seguem dados: ");
			System.out.println(contato);
		} catch (Exception e) {
			System.out.println("Posição inválida");
		}
	}

	private static void obtemContato(Scanner scan, ArrayList<Contato> lista) {
		int posicaoContato = lerInformacaoInt("Entre com a posição a ser pesquisada: ", scan);

		try {
			Contato contato = lista.get(posicaoContato);
			System.out.println("Contato existe, seguem dados: ");
			System.out.println(contato);
			System.out.println("Fazendo pesquisa do contato encontrado: ");
			posicaoContato = lista.indexOf(contato);
			System.out.println("Contato encontrado na posição: " + posicaoContato);

		} catch (Exception e) {
			System.out.println("Posição inválida");
		}
	}

	private static void pesquisarUltimoIndiceContato(Scanner scan, ArrayList<Contato> lista) {
		int posicaoContato = lerInformacaoInt("Entre com a posição a ser pesquisada: ", scan);

		try {
			Contato contato = lista.get(posicaoContato);
			System.out.println("Contato existe, seguem dados: ");
			System.out.println(contato);
			System.out.println("Fazendo pesquisa do último contato encontrado: ");
			posicaoContato = lista.lastIndexOf(contato);
			System.out.println("Contato encontrado na posição: " + posicaoContato);

		} catch (Exception e) {
			System.out.println("Posição inválida");
		}
	}

	private static void pesquisarUContatoExiste(Scanner scan, ArrayList<Contato> lista) {
		int posicaoContato = lerInformacaoInt("Entre com a posição a ser pesquisada: ", scan);

		try {
			Contato contato = lista.get(posicaoContato);
			boolean existe = lista.contains(contato);
			if (existe) {
				System.out.println("Contato existe, seguem dados: ");
				System.out.println(contato);
			} else {
				System.out.println("Contato não existe");
			}

		} catch (Exception e) {
			System.out.println("Posição inválida");
		}
	}

	private static void excluirPorPosicao(Scanner scan, ArrayList<Contato> lista) {
		int posicaoContato = lerInformacaoInt("Entre com a posição a ser removida: ", scan);

		try {
			Contato contato = lista.get(posicaoContato);
			System.out.println("Contato selecionado para exclusão: " + contato);

			lista.remove(posicaoContato);

			System.out.println();
		} catch (Exception e) {
			System.out.println("Posição inválida");
		}
	}

	private static void excluirContato(Scanner scan, ArrayList<Contato> lista) {
		int posicaoContato = lerInformacaoInt("Entre com a posição a ser removida: ", scan);

		try {
			Contato contato = lista.get(posicaoContato);
			System.out.println("Contato selecionado para exclusão: " + contato);

			lista.remove(contato);
		} catch (Exception e) {
			System.out.println("Posição inválida");
		}
	}

	private static void imprimeTamanhoDoVetor(ArrayList<Contato> lista) {
		try {
			System.out.println("Tamanho do vetor é de :" + lista.size());
		} catch (Exception e) {
			System.out.println("Posição inválida");
		}
	}

	protected static void limparTodosOsContatos(ArrayList<Contato> lista) {
		try {
			lista.clear();
			System.out.println("Removendo todos os contatos.");
		} catch (Exception e) {
			System.out.println("Erro ao realizar exclusão da lista, lista inválida");
		}
	}

	private static void imprimeContatos(ArrayList<Contato> lista) {
		try {
			System.out.println(lista);
		} catch (Exception e) {
			System.out.println("Erro ao realizar exclusão da lista, lista inválida");
		}
	}

	private static void criarContatosDinamicamenter(int quantidade, ArrayList<Contato> lista) {
		// boa pratica criar uma variavel fora do loop e depois reusar ela como padrao
		Contato contato;

		for (int i = 1; i <= quantidade; i++) {
			contato = new Contato();
			contato.setNome("Contato " + i);
			contato.setNome("1111111 " + i);
			contato.setNome("contato " + i + "@email.com");

			lista.add(contato);
		}
	}
}
