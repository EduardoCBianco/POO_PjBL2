package Emprestimo;
import java.time.LocalDate;
import java.util.ArrayList;

import Amigo.*;
import Amigo.ListaAmigos;
import Item.Disponibilidade;
import Item.Item;

public class Emprestimo {

	private Item item;
	private Amigo amigo;
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
	
	public int getIdAmigo() {
		return idAmigo;
	}
	public int getIdItem() {
		return idItem;
	}
	public LocalDate getDataEmprestimo() {
		return dataEmprestimo;
	}
	public LocalDate getDataDevolucao() {
		return dataDevolucao;
	}
	public void setDataDevolucao(LocalDate dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}

	public Amigo getAmigo(int idAmigo, ListaAmigos alAmigos) {
		return alAmigos.getAmigo(idAmigo);
	}

	public Item getItem(int idItem, ArrayList<Item> alItem) {
		return alItem.get(idItem-1);
	}

}
