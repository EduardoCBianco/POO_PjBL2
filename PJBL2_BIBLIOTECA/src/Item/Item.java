package Item;
public abstract class Item implements Comparable<Item> {

	private int IdItem;
	private String tituloItem;
	private Disponibilidade dispItem;
	
	public Item(int idItem, String tituloItem) {
		IdItem = idItem;
		this.tituloItem = tituloItem;
		dispItem = Disponibilidade.DISPONIVEL;
	}

	public Disponibilidade getDispItem() {
		return dispItem;
	}
	public void setDispItem(Disponibilidade dispItem) {
		this.dispItem = dispItem;
	}
	public int getIdItem() {
		return IdItem;
	}
	public void setIdItem(int idItem) {
		IdItem = idItem;
	}
	public String getTituloItem() {
		return tituloItem;
	}
	public void setTituloItem(String tituloItem) {
		this.tituloItem = tituloItem;
	}

	public String getName() {
		return "Item";
	}

	@Override
	public int compareTo(Item item) {
		// System.out.println("item 1" + item.getName());
		// System.out.println("item 2" + item.getName());
		return tituloItem.toUpperCase().compareTo(item.getTituloItem().toUpperCase());
	}

	
}
