package Item;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Biblioteca {

	private String nomeBib;
	private ArrayList<Item> alItem;
	private ArrayList<Item> alItemSorted;

	public Biblioteca(String nomeBib) {
		this.nomeBib = nomeBib;
		this.alItem = new ArrayList<Item>();
		 
	}

	public int addItem(int escolhaItem, String tituloItem) {
		// 1- Livro
		// 2- Filme
		// 3- Album de musica
		int idItem;
		switch(escolhaItem){
			case 1:
			idItem = alItem.size() + 1;
			Livro livro = new Livro(idItem, tituloItem);
			alItem.add(livro);
			return idItem;

			case 2:
			idItem = alItem.size() + 1;
			Filme filme = new Filme(idItem, tituloItem);
			alItem.add(filme);
			return idItem;

			case 3:
			idItem = alItem.size() + 1;
			AlbumMusica albumMusica = new AlbumMusica(idItem, tituloItem);
			alItem.add(albumMusica);
			return idItem;

			default:
			return -1;
		}


	}
	

	public ArrayList<Item> getAlItem() {
		return alItem;
	}

	public ArrayList<Item> getAlItemSorted() {
		this.alItemSorted = new ArrayList<Item>(alItem);
		Collections.sort(alItemSorted);
		return alItemSorted;
	}

	public Item getItem(int idItem) {
		return this.alItem.get(idItem);
	}

}
