package Principal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import Amigo.*;
import Emprestimo.*;
import Item.*;

public class Principal {
	
	private static Scanner scanner = new Scanner(System.in);
	private static Biblioteca bib = new Biblioteca("Biblioteca Pessoal");
	private static ListaEmprestimos emprestimos = new ListaEmprestimos();
	private static ListaAmigos amigos = new ListaAmigos();
	
	public static void main(String[] args) {
		// apenas alguns exemplos de manipula��o em rela��o a amigos
		// da mesma forma faz com biv e emprestimos
		// criando fun��es static na main para implementar as op��es do menu
		
		int idAmigo;
		idAmigo = amigos.addAmigo("Fulano");
		System.out.println("Adicionado com codigo " + idAmigo);

		idAmigo = amigos.addAmigo("Ciclano");
		System.out.println("Adicionado com codigo " + idAmigo);

		idAmigo = amigos.addAmigo("Junin");
		System.out.println("Adicionado com codigo " + idAmigo);

		EspecificarLivro(bib.addItem(1, "Dom Casmurro")-1, "Machado de Assis", 210);
		EspecificarAlbumMusica(bib.addItem(3, "Summer Eletrohits")-1, "Som Livre", 2005);

		ArrayList<Amigo> alAmigos = amigos.getListaAmigos();
		for (Amigo amigo : alAmigos) {
			System.out.println(amigo);
		}
		
		menu();
			
	}
	
	private static void menu(){
		/*  Menu do sistema Biblioteca Pessoal
	     *  0 - sair
	     *  1 - cadastrar item
	     *  2 - cadastrar amigo
	     *  3 - emprestar
	     *  4 - devolver
	     *  5 - listar emprestimos atuais
	     *  6 - listar hist�rico de empr�stimos
	     *  7 - listar biblioteca
	     */
			int opcao;
	
			do{
				System.out.println("\tMenu da Biblioteca");
				  System.out.println("0. Finalizar o programa");
				  System.out.println("1. Cadastrar item");
				  System.out.println("2. Cadastrar amigo");
				System.out.println("3. Emprestar item ao amigo");
				System.out.println("4. Realizar devolucao de um item");
				System.out.println("5. Listar emprestimos atuais");
				System.out.println("6. Listar historico de emprestimos");
				System.out.println("7. Listar biblioteca");				
				System.out.print("Opcao: ");
		  
				opcao = scanner.nextInt();
				
				switch(opcao){
					case 0:
					System.out.println("Programa encerrado");	   
					scanner.close();
	
					break;
	
					case 1:
					cadastrarItem();
					
					break;
					
					case 2:
					cadastrarAmigo();
					
					break;
	
					case 3:
					System.out.println("\nLista de itens cadastrados na biblioteca ");
					ListarItens();
					System.out.println("\nDigite o ID do item que deseja emprestar: ");				
					System.out.print("Opcao: ");
					int idItem = scanner.nextInt();

					ListarAmigos();
					System.out.println("\nDigite o ID do amigo para qual deseja emprestar: ");				
					System.out.print("Opcao: ");
					
					int idAmigo = scanner.nextInt();
					emprestarItem(idAmigo, idItem);


					break;
	
					case 4:
					//devolucaoItem();

					break;
	
					case 5:
					//listarEmprestimos();
	
					break;
					
					case 6:
					//historicoEmprestimos();
					
					break;
					
					case 7:
					//listarBiblioteca();
					
					break;

					default:
						System.out.println("Opcao invalida.");
				}
				} while(opcao != 0);
				ArrayList<Amigo> alAmigos = amigos.getListaAmigos();
				for (Amigo amigo : alAmigos) {
					System.out.println(amigo);
				}
		}

	private static void cadastrarAmigo(){
			System.out.print("\nNome do amigo a ser adicionado: ");

			scanner.nextLine();
			String novoAmigo = scanner.nextLine();
			int idAmigo = amigos.addAmigo(novoAmigo);
			System.out.println("\n" + novoAmigo + " foi adicionado na lista de amigos com o id: " + idAmigo + "\n");
		}

	private static int cadastrarItem(){
		String tituloItem;
		int idItem;
		int escolhaItem;
		
		do {
			System.out.print("\nEscolha qual tipo deseja cadastrar: ");
			System.out.print("\n0 - Cancelar");
			System.out.print("\n1 - Livro");
			System.out.print("\n2 - Filme");
			System.out.print("\n3 - Album de Musica\n");
			System.out.print("Opcao: ");

			scanner.nextLine();
			escolhaItem = scanner.nextInt();

			switch (escolhaItem) {
				case 0:
				System.out.print("\nRetornando ao menu principal.\n");
					break;

				case 1:
				System.out.print("\nTitulo do livro: ");
				scanner.nextLine();
				tituloItem = scanner.nextLine();

				idItem = bib.addItem(escolhaItem, tituloItem);
				
				System.out.print("\nNome do autor do livro: ");
				String autorLivro = scanner.nextLine();

				System.out.print("\nNumero de paginas do livro: ");
				int totPagLivro = scanner.nextInt();
				EspecificarLivro(idItem-1, autorLivro, totPagLivro);
				System.out.print("\nLivro adicionado com sucesso! \n");
					return idItem;

				case 2:
				System.out.print("\nTitulo do Filme: ");
				scanner.nextLine();
				tituloItem = scanner.nextLine();
				idItem = bib.addItem(escolhaItem, tituloItem);
				
				System.out.print("\nDiretor do filme: ");
				String filme = scanner.nextLine();

				System.out.print("\nAno do lancamendo do filme: ");
				int anoFilme = scanner.nextInt();
				EspecificarFilme(idItem-1, filme, anoFilme);
				System.out.print("\nFilme adicionado com sucesso! \n");
					return idItem;

				case 3:
				System.out.print("\nTitulo do Album: ");
				scanner.nextLine();
				tituloItem = scanner.nextLine();
				idItem = bib.addItem(escolhaItem, tituloItem);
				
				System.out.print("\nBanda ou compositor: ");
				String banda = scanner.nextLine();

				System.out.print("\nAno do lancamendo do album: ");
				int anoAlbum = scanner.nextInt();
				EspecificarAlbumMusica(idItem-1, banda, anoAlbum);

				System.out.print("\nAlbum adicionado com sucesso! \n");
					return idItem;
			
				default:
				System.out.println("Opcao invalida.");

					break;
			}
		} while (escolhaItem != 0);

		return 0;

	}
	
	private static void EspecificarAlbumMusica(int idItem, String banda, int ano){
		AlbumMusica albumMusica = (AlbumMusica) bib.getAlItem().get(idItem);
		albumMusica.setAno(ano);
		albumMusica.setBanda(banda);
		
	}
	private static void EspecificarFilme(int idItem, String diretor, int ano){
		Filme filme = (Filme) bib.getAlItem().get(idItem);
		filme.setAno(ano);
		filme.setDiretor(diretor);

	}
	private static void EspecificarLivro(int idItem, String autorLivro, int totPagLivro){
		Livro livro = (Livro) bib.getAlItem().get(idItem);
		livro.setAutorLivro(autorLivro);
		livro.setTotPagLivro(totPagLivro);

	}

	private static void ListarAmigos(){
		
		for (Amigo amigo : amigos.getListaAmigos()) {
			System.out.println("   " + amigo.getNomeAmigo() + " ( ID = " + amigo.getIdAmigo() + " )" );
		}

	}

	private static void ListarItens(){
		
		for (Item item : bib.getAlItem()) {
			System.out.println(item.getName() + " - " + item.getTituloItem() + " ( ID = " + item.getIdItem() + " )" + " { Situacao = " + item.getDispItem() + " }");
		}

	}

	private static void emprestarItem(int idAmigo, int idItem){
		if(bib.getAlItem().get(idItem).getDispItem() == Disponibilidade.DISPONIVEL ){
			
		}

	}
}

