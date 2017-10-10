package by.itakademy.lg.task19;

public class Task19 {

	public static void main(String[] args) {
		String str = "    Жизнь и Смерть. Что мы знаем о них? Немного. ";
		str = str.trim();
		String[] str1 = str.split(" +");
		int sumWord = 0;
		for (@SuppressWarnings("unused") String word : str1) {
			sumWord++;

		}

		System.out.println("Количество слов " + sumWord);
	}

}