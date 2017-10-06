package by.itakademy.lg.task20;

public class Task20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "    “екстова€, строка, с несколькими, зап€тыми ";
		int a = 0;
		char b;
		char word;

		for (int i = 1; i < str.length(); i++) {
			b = str.charAt(i);
			a = i - 1;
			if (b == ' ' || b == '.' || b == ',' || b == '?' || b == '!') {
				word = str.charAt(a);
				if (word == ' ' || word == '.' || word == ',' || word == '?' || word == '!') {

				} else {
					System.out.print(word);
				}

			}

		}

	}

}
