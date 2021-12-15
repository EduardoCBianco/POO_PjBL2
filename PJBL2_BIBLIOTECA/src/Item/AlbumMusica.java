package Item;
public class AlbumMusica extends Item {

	private String banda;
	private int ano;

	public AlbumMusica(int idItem, String tituloItem, String banda, int ano) {
		super(idItem, tituloItem);
		this.banda = banda;
		this.ano = ano;
	}

	public AlbumMusica(int idItem, String tituloItem) {
		super(idItem, tituloItem);
		this.banda = "Nao informado";
		this.ano = 9999;

	}

	public String getBanda() {
		return banda;
	}

	public void setBanda(String banda) {
		this.banda = banda;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

    public String getName() {
        return "Album de Musica";
    }

}
