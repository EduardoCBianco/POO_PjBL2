package Amigo;
public class Amigo implements Comparable<Amigo> {
	
	private int idAmigo;
	private String nomeAmigo;

	public Amigo(int idAmigo, String nomeAmigo) {
		super();
		this.idAmigo = idAmigo;
		this.nomeAmigo = nomeAmigo;
	}

	public int getIdAmigo() {
		return idAmigo;
	}

	public void setIdAmigo(int idAmigo) {
		this.idAmigo = idAmigo;
	}

	public String getNomeAmigo() {
		return nomeAmigo;
	}

	public void setNomeAmigo(String nomeAmigo) {
		this.nomeAmigo = nomeAmigo;
	}

	@Override
	public String toString() {
		return nomeAmigo + " - " + "ID = " + idAmigo;
	}

	@Override
	public int compareTo(Amigo amigo) {
		return this.nomeAmigo.toUpperCase().compareTo(amigo.getNomeAmigo().toUpperCase());
	}

}
