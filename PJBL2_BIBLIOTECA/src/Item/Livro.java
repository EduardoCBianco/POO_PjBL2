package Item;
public class Livro extends Item {

	private String autorLivro;
	private int totPagLivro;
	
	public Livro(int idItem, String tituloItem, String autorLivro, int totPagLivro) {
		super(idItem, tituloItem);
		this.autorLivro = autorLivro;
		this.totPagLivro = totPagLivro;
    }

	public Livro(int idItem, String tituloItem) {
		super(idItem, tituloItem);
		this.autorLivro = "Nao informado";
		this.totPagLivro = 0;
    }

	public String getAutorLivro() {
		return autorLivro;
	}

	public void setAutorLivro(String autorLivro) {
		this.autorLivro = autorLivro;
	}

	public int getTotPagLivro() {
		return totPagLivro;
	}

	public void setTotPagLivro(int totPagLivro) {
		this.totPagLivro = totPagLivro;
	}

    public String getName() {
        return "Livro";
    }

}
