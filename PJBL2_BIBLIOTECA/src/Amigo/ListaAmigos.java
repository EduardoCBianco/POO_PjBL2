package Amigo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ListaAmigos {

	private ArrayList<Amigo> alAmigos;
	
	// construtor
	public ListaAmigos() {
		super();
		this.alAmigos = new ArrayList<Amigo>();
	}
	
	public int addAmigo (String nome) {
		int idAmigo = alAmigos.size() + 1; 
		Amigo amigo = new Amigo(idAmigo, nome);
		alAmigos.add(amigo);
		return idAmigo;
	}
	
	public ArrayList<Amigo> getListaAmigos(){
		return alAmigos;
	}

	public Amigo getAmigo(int idAmigo){
		return alAmigos.get(idAmigo-1);
	}

	

	// getters e setters
	// toString

}
