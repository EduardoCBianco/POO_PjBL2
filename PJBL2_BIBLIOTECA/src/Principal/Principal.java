package Principal;

import java.util.ArrayList;
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
					//cadastrarItem();
					
					break;
					
					case 2:
					cadastrarAmigo();
					
					break;
	
					case 3:
					//emprestarItem();
					
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
		}

		private static void cadastrarAmigo(){
			int idAmigo;
			System.out.print("\nNome do amigo a ser adicionado: ");

			scanner.nextLine();
			String novoAmigo = scanner.nextLine();
			idAmigo = amigos.addAmigo(novoAmigo);
			System.out.println("\n" + novoAmigo + " foi adicionado na lista de amigos com o id: " + idAmigo);
		}
}
