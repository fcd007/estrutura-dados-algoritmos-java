package com.javacode.estruturadados.labs;

import java.util.ArrayList;
import java.util.Scanner;

import com.javacode.estruturadados.entidade.Contato;

public class Exercicio7 extends Exercicio06{

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
				adicionarContatoFinal(scan, ArrayList);
				break;
			}
			case 2: {
				adicionarContatoPosicao(scan, ArrayList);
				break;
			}
			case 3: {
				obtemContatoPosicao(scan, ArrayList);
				break;
			}
			case 4: {
				obtemContato(scan, ArrayList);
				break;
			}
			case 5: {
				pesquisarUltimoIndiceContato(scan, ArrayList);
				break;
			}
			case 6: {
				pesquisarUContatoExiste(scan, ArrayList);
				break;
			}
			case 7: {
				excluirPorPosicao(scan, ArrayList);
				break;
			}
			case 8: {
				excluirContato(scan, ArrayList);
				break;
			}
			case 9: {
				imprimeTamanhoDoVetor(ArrayList);
				break;
			}
			case 10: {
				limparTodosOsContatos(ArrayList);
				break;
			}
			case 11: {
				imprimeContatos(ArrayList);
				break;
			}

			default:
				throw new IllegalArgumentException("Unexpected value: " + opcao);
			}
		}
	}

	private static void adicionarContatoFinal(Scanner scan, ArrayList<Contato> ArrayList) {
		System.out.println("Criando um contato, entre com as informações: ");
		String nome = lerInformcao("Entre com o nome: ", scan);
		String telefone = lerInformcao("Entre com o telefone: ", scan);
		String email = lerInformcao("Entre com o email: ", scan);

		Contato contato = new Contato(nome, email, telefone);

		ArrayList.adiciona(contato);

		System.out.println("Contato adicionado com sucesso");
		System.out.println(contato);
	}

	private static void adicionarContatoPosicao(Scanner scan, ArrayList<Contato> ArrayList) {
		System.out.println("Criando um contato, entre com as informações: ");
		String nome = lerInformcao("Entre com o nome: ", scan);
		String telefone = lerInformcao("Entre com o telefone: ", scan);
		String email = lerInformcao("Entre com o email: ", scan);

		Contato contato = new Contato(nome, email, telefone);

		int posicaoInsercao = lerInformacaoInt(email, scan);

		try {
			ArrayList.adiciona(posicaoInsercao, contato);
			System.out.println("Contato adicionado com sucesso.");
			System.out.println(contato);
		} catch (Exception e) {
			System.out.println("Não adicionado");
		}

		System.out.println("Contato adicionado com sucesso");
		System.out.println(contato.toString());
	}

	private static void obtemContatoPosicao(Scanner scan, ArrayList<Contato> ArrayList) {
		int posicaoContato = lerInformacaoInt("Entre com a posição a ser pesquisada: ", scan);

		try {
			Contato contato = ArrayList.busca(posicaoContato);
			System.out.println("Contato existe, seguem dados: ");
			System.out.println(contato);
		} catch (Exception e) {
			System.out.println("Posição inválida");
		}
	}
	
	private static void obtemContato(Scanner scan, ArrayList<Contato> ArrayList) {
		int posicaoContato = lerInformacaoInt("Entre com a posição a ser pesquisada: ", scan);

		try {
			Contato contato = ArrayList.busca(posicaoContato);
			System.out.println("Contato existe, seguem dados: ");
			System.out.println(contato);
			System.out.println("Fazendo pesquisa do contato encontrado: ");
			posicaoContato = ArrayList.busca(contato);
			System.out.println("Contato encontrado na posição: " + posicaoContato);
			
		} catch (Exception e) {
			System.out.println("Posição inválida");
		}
	}
	
	private static void pesquisarUltimoIndiceContato(Scanner scan, ArrayList<Contato> ArrayList) {
		int posicaoContato = lerInformacaoInt("Entre com a posição a ser pesquisada: ", scan);

		try {
			Contato contato = ArrayList.busca(posicaoContato);
			System.out.println("Contato existe, seguem dados: ");
			System.out.println(contato);
			System.out.println("Fazendo pesquisa do último contato encontrado: ");
			posicaoContato = ArrayList.ultimoIndice(contato);
			System.out.println("Contato encontrado na posição: " + posicaoContato);
			
		} catch (Exception e) {
			System.out.println("Posição inválida");
		}
	}
	
	private static void pesquisarUContatoExiste(Scanner scan, ArrayList<Contato> ArrayList) {
		int posicaoContato = lerInformacaoInt("Entre com a posição a ser pesquisada: ", scan);
		
		try {
			Contato contato = ArrayList.busca(posicaoContato);
			boolean existe = ArrayList.contem(contato);
			if(existe) {
				System.out.println("Contato existe, seguem dados: ");
				System.out.println(contato);				
			}else {
				System.out.println("Contato não existe");
			}
			
		} catch (Exception e) {
			System.out.println("Posição inválida");
		}
	}
	
	private static void excluirPorPosicao(Scanner scan, ArrayList<Contato> ArrayList) {
		int posicaoContato = lerInformacaoInt("Entre com a posição a ser removida: ", scan);
		
		try {
			Contato contato = ArrayList.busca(posicaoContato);
			System.out.println("Contato selecionado para exclusão: " + contato);
			
			ArrayList.remove(posicaoContato);
			
			System.out.println();
		} catch (Exception e) {
			System.out.println("Posição inválida");
		}
	}
	
	private static void excluirContato(Scanner scan, ArrayList<Contato> ArrayList) {
		int posicaoContato = lerInformacaoInt("Entre com a posição a ser removida: ", scan);
		
		try {
			Contato contato = ArrayList.busca(posicaoContato);
			System.out.println("Contato selecionado para exclusão: " + contato);
			
			ArrayList.remove(contato);
		} catch (Exception e) {
			System.out.println("Posição inválida");
		}
	}
	
	private static void imprimeTamanhoDoVetor(ArrayList<Contato> ArrayList) {		
		try {
			System.out.println("Tamanho do vetor é de :" + ArrayList.tamanho());
		} catch (Exception e) {
			System.out.println("Posição inválida");
		}
	}
	
	private static void limparTodosOsContatos(ArrayList<Contato> ArrayList) {		
		try {
			ArrayList.limpar();
			System.out.println("Removendo todos os contatos.");
		} catch (Exception e) {
			System.out.println("Erro ao realizar exclusão da ArrayList, ArrayList inválida");
		}
	}
	
	private static void imprimeContatos(ArrayList<Contato> ArrayList) {		
		try {
			System.out.println(ArrayList);
		} catch (Exception e) {
			System.out.println("Erro ao realizar exclusão da ArrayList, ArrayList inválida");
		}
	}
}
