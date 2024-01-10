package com.javacode.estruturadados.labs;

import java.util.Scanner;

import com.javacode.estruturadados.entidade.Contato;
import com.javacode.estruturadados.vetor.Lista;

public class Exercicio06 {

	public static void main(String[] args) {

		// criação das variaáveis
		Scanner scan = new Scanner(System.in);

		// criar um vetor com 20 de capacidade
		Lista<Contato> lista = new Lista<Contato>(20);

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
				
				yield type;
			}
			case 5: {

				yield type;
			}
			case 6: {

				yield type;
			}
			case 7: {

				yield type;
			}
			case 8: {

				yield type;
			}

			case 9: {

				yield type;
			}
			case 10: {

				yield type;
			}

			case 11: {

				yield type;
			}

			default:
				throw new IllegalArgumentException("Unexpected value: " + opcao);
			}
		}
	}

	private static void adicionarContatoFinal(Scanner scan, Lista<Contato> lista) {
		System.out.println("Criando um contato, entre com as informações: ");
		String nome = lerInformcao("Entre com o nome: ", scan);
		String telefone = lerInformcao("Entre com o telefone: ", scan);
		String email = lerInformcao("Entre com o email: ", scan);

		Contato contato = new Contato(nome, email, telefone);

		lista.adiciona(contato);

		System.out.println("Contato adicionado com sucesso");
		System.out.println(contato);
	}

	private static void adicionarContatoPosicao(Scanner scan, Lista<Contato> lista) {
		System.out.println("Criando um contato, entre com as informações: ");
		String nome = lerInformcao("Entre com o nome: ", scan);
		String telefone = lerInformcao("Entre com o telefone: ", scan);
		String email = lerInformcao("Entre com o email: ", scan);

		Contato contato = new Contato(nome, email, telefone);

		int posicaoInsercao = lerInformacaoInt(email, scan);

		try {
			lista.adiciona(posicaoInsercao, contato);
			System.out.println("Contato adicionado com sucesso.");
			System.out.println(contato);
		} catch (Exception e) {
			System.out.println("Não adicionado");
		}

		System.out.println("Contato adicionado com sucesso");
		System.out.println(contato.toString());
	}
	
	private static void obtemContatoPosicao(Scanner scan, Lista<Contato> lista) {
		int posicaoContato = lerInformacaoInt("Entre com a posição a serpesquisada: ", scan);
		
		try {
			  Contato contato = lista.busca(posicaoContato);
			  System.out.println("Contato existe, seguem dados: ");
			  System.out.println(contato);
		} catch (Exception e) {
			System.out.println("Posição inválida");
		}
	}

	private static int lerInformacaoInt(String mensagem, Scanner scan) {
		boolean entradaValida = false;
		int numero = 0;

		while (!entradaValida) {
			try {
				System.out.println(mensagem);
				String entrada = scan.nextLine();

				numero = Integer.parseInt(mensagem);

				entradaValida = true;
			} catch (Exception e) {
				System.out.println("Entrada inválida, digite novamente");
			}
		}

		return numero;
	}

	private static String lerInformcao(String mensagem, Scanner scan) {
		System.out.println(mensagem);
		String entrada = scan.nextLine();

		return entrada;
	}

	private static int obterOpcaoMenu(Scanner scan) {

		boolean entradaValida = false;
		int opcao = 0;
		String entrada;

		while (!entradaValida) {
			System.out.println("Digite a opção desejada: ");
			System.out.println("0: Sair");
			System.out.println("1: Adiciona contato no final do vetor");
			System.out.println("2: Adiciona contato em uma posição específica");
			System.out.println("3: Obtém contato de uma posição específica");
			System.out.println("4: Consulta contato");
			System.out.println("5: Consulta [ultimo contato índica do contato");
			System.out.println("6: Verifica se contato existe");
			System.out.println("7: Excluir por posição se contato existe");
			System.out.println("8: Excluir contato");
			System.out.println("9: Verifica tamanho do vetor");
			System.out.println("10: Excluir todos os contato");
			System.out.println("11: Imprime vetor");

			try {

				entrada = scan.nextLine();
				opcao = Integer.parseInt(entrada);

				if (opcao >= 0 && opcao <= 11) {
					entradaValida = true;
				} else {
					throw new Exception();
				}

			} catch (Exception e) {
				System.out.println("Entrada inválida, digite novamente\n");
			}

		}

		return opcao;
	}

	private static void criarContatosDinamicamenter(int quantidade, Lista<Contato> lista) {
		// boa pratica criar uma variavel fora do loop e depois reusar ela como padrao
		Contato contato;

		for (int i = 1; i <= quantidade; i++) {
			contato = new Contato();
			contato.setNome("Contato " + i);
			contato.setNome("1111111 " + i);
			contato.setNome("contato " + i + "@email.com");

			lista.adiciona(contato);
		}
	}
}
