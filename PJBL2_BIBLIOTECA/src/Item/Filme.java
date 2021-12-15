package Item;
public class Filme extends Item {

    private String diretor;
	private int ano;

    public Filme(int idItem, String tituloItem, String diretor, int ano) {
        super(idItem, tituloItem);
        this.diretor = diretor;
        this.ano = ano;
    }

	public Filme(int idItem, String tituloItem) {
        super(idItem, tituloItem);
        this.diretor = "Nao informado";
        this.ano = 9999;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getName() {
        return "Filme";
    }

}
