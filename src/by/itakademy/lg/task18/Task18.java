package by.itakademy.lg.task18;

public class Task18 {

	public static void main(String[] args) {
		String str = "Текстовая, строка, ! с несколькими,, запятыми.";
		int n = 0;
		char symbol;
		for (int i = 0; i < str.length(); i++) {
			symbol = str.charAt(i);
			if (symbol == ',' || symbol == '.' || symbol == '!'
					|| symbol == '?')
				n++;

		}
		System.out.println("У нас есть " + n + " знаков применания");
	}

}