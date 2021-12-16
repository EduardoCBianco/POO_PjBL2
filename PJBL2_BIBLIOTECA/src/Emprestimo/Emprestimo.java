package Emprestimo;
import java.time.LocalDate;

import Amigo.Amigo;
import Item.Item;

public class Emprestimo {

	private int idAmigo;
	private int idItem;
	private LocalDate dataEmprestimo;
	private LocalDate dataDevolucao;
	
	
	public Emprestimo(int idAmigo, int idItem, LocalDate dataEmprestimo) {
		this.idAmigo = idAmigo;
		this.idItem = idItem;
		this.dataEmprestimo = dataEmprestimo;
		this.dataDevolucao = null;
	}

	// para a equipe pensar nesta repeti��o, pois pode-se obter os objetos pelo IDs
	private Item item;
	private Amigo amigo;

}
