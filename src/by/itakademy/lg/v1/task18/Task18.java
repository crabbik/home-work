package by.itakademy.lg.v1.task18;

public class Task18 {

	public static void main(String[] args) {
		String str = "Жизнь и Смерть. Что мы знаем о них? Немного. ";
		int n = 0;
		char symbol;
		for (int i = 0; i < str.length(); i++) {
			symbol = str.charAt(i);
			if (symbol == ',' || symbol == '.' || symbol == '!' || symbol == '?') {
				n++;
			}
		}
		System.out.println("Всего " + n + " знаков препинания");
	}

}