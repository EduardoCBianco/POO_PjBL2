package Emprestimo;
import java.time.LocalDate;
import java.util.ArrayList;

public class ListaEmprestimos {

	private ArrayList<Emprestimo> alEmprestimos;

	public ListaEmprestimos() {
		super();
		this.alEmprestimos = new ArrayList<Emprestimo>();
	}	
	
	public void addEmprestimo(int idAmigo, int idItem, LocalDate dataEmprestimo) {
		Emprestimo emprestimo = new Emprestimo(idAmigo, idItem, dataEmprestimo);
		alEmprestimos.add(emprestimo);
	}

	public ArrayList<Emprestimo> getAlEmprestimos() {
		return alEmprestimos;
	}

	public void add(Emprestimo e1) {
		alEmprestimos.add(e1);
	}
	

}
