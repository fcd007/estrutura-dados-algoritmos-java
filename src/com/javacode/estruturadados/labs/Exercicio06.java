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
		int posicaoContato = lerInformacaoInt("Entre com a posição a ser pesquisada: ", scan);

		try {
			Contato contato = lista.busca(posicaoContato);
			System.out.println("Contato existe, seguem dados: ");
			System.out.println(contato);
		} catch (Exception e) {
			System.out.println("Posição inválida");
		}
	}
	
	private static void obtemContato(Scanner scan, Lista<Contato> lista) {
		int posicaoContato = lerInformacaoInt("Entre com a posição a ser pesquisada: ", scan);

		try {
			Contato contato = lista.busca(posicaoContato);
			System.out.println("Contato existe, seguem dados: ");
			System.out.println(contato);
			System.out.println("Fazendo pesquisa do contato encontrado: ");
			posicaoContato = lista.busca(contato);
			System.out.println("Contato encontrado na posição: " + posicaoContato);
			
		} catch (Exception e) {
			System.out.println("Posição inválida");
		}
	}
	
	private static void pesquisarUltimoIndiceContato(Scanner scan, Lista<Contato> lista) {
		int posicaoContato = lerInformacaoInt("Entre com a posição a ser pesquisada: ", scan);

		try {
			Contato contato = lista.busca(posicaoContato);
			System.out.println("Contato existe, seguem dados: ");
			System.out.println(contato);
			System.out.println("Fazendo pesquisa do último contato encontrado: ");
			posicaoContato = lista.ultimoIndice(contato);
			System.out.println("Contato encontrado na posição: " + posicaoContato);
			
		} catch (Exception e) {
			System.out.println("Posição inválida");
		}
	}
	
	private static void pesquisarUContatoExiste(Scanner scan, Lista<Contato> lista) {
		int posicaoContato = lerInformacaoInt("Entre com a posição a ser pesquisada: ", scan);
		
		try {
			Contato contato = lista.busca(posicaoContato);
			boolean existe = lista.contem(contato);
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
	
	private static void excluirPorPosicao(Scanner scan, Lista<Contato> lista) {
		int posicaoContato = lerInformacaoInt("Entre com a posição a ser removida: ", scan);
		
		try {
			Contato contato = lista.busca(posicaoContato);
			System.out.println("Contato selecionado para exclusão: " + contato);
			
			lista.remove(posicaoContato);
			
			System.out.println();
		} catch (Exception e) {
			System.out.println("Posição inválida");
		}
	}
	
	private static void excluirContato(Scanner scan, Lista<Contato> lista) {
		int posicaoContato = lerInformacaoInt("Entre com a posição a ser removida: ", scan);
		
		try {
			Contato contato = lista.busca(posicaoContato);
			System.out.println("Contato selecionado para exclusão: " + contato);
			
			lista.remove(contato);
		} catch (Exception e) {
			System.out.println("Posição inválida");
		}
	}
	
	private static void imprimeTamanhoDoVetor(Lista<Contato> lista) {		
		try {
			System.out.println("Tamanho do vetor é de :" + lista.tamanho());
		} catch (Exception e) {
			System.out.println("Posição inválida");
		}
	}
	
	protected static void limparTodosOsContatos(Lista<Contato> lista) {		
		try {
			lista.limpar();
			System.out.println("Removendo todos os contatos.");
		} catch (Exception e) {
			System.out.println("Erro ao realizar exclusão da lista, lista inválida");
		}
	}
	
	private static void imprimeContatos(Lista<Contato> lista) {		
		try {
			System.out.println(lista);
		} catch (Exception e) {
			System.out.println("Erro ao realizar exclusão da lista, lista inválida");
		}
	}

	protected static int lerInformacaoInt(String mensagem, Scanner scan) {
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

	protected static String lerInformcao(String mensagem, Scanner scan) {
		System.out.println(mensagem);
		String entrada = scan.nextLine();

		return entrada;
	}

	protected static int obterOpcaoMenu(Scanner scan) {

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

	protected static void criarContatosDinamicamenter(int quantidade, Lista<Contato> lista) {
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