package by.itakademy.lg.v2.task1;

public class Terminal {
	private String name;
	public Terminal(String name) {
		super();
		this.name = name;
	}
	public synchronized void  handle(Object q) {
		System.out.println(String.format("На кассе %s: Обрабатываю продукт %s", name,q ));
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
