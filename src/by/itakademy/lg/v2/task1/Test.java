package by.itakademy.lg.v2.task1;

public class Test {

	public static void main(String[] args) {

		Terminal terminal1= new Terminal("1");
		Terminal terminal2 = new Terminal("2");
		Client client1 = new Client(new String[]{"Вода","сок","печенье", "конфеты"}, terminal1);
		Client client2 = new Client(new String[]{"Пиво ", "водка", "коньяк", "сигареты", "вино"}, terminal1);
		Client client3 = new Client(new String[]{"Курица", "свинина", "говядина", "фарш", "котлеты"}, terminal2);
		Client client4 = new Client(new String[]{"Помидоры", "огурцы","капуста", "салат"}, terminal2);
		
		client1.start();
		client2.start();
		client3.start();
		client4.start();
	}

}
