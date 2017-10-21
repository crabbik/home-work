package by.itakademy.lg.v2.task1;

public class Client extends Thread {

	private String[] products;
	private Terminal terminal;

	public Client(String[] products, Terminal terminal) {
		super();
		this.products = products;
		this.terminal = terminal;
	}

	public void run() {
		for (String string : products) {
			terminal.handle(string);

		}
	}

	public String[] getProducts() {
		return products;
	}

	public void setProducts(String[] products) {
		this.products = products;
	}

	public Terminal getTerminal() {
		return terminal;
	}

	public void setTerminal(Terminal terminal) {
		this.terminal = terminal;
	}

}
