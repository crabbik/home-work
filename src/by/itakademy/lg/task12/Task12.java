package by.itakademy.lg.task12;

public class Task12 {

	public static void main(String[] args) {
		int j = 0;
		Integer number = 20023143;

		String numberToString = number.toString();

		char[] charArray = numberToString.toCharArray();
		if (charArray.length % 3 == 1)
			j = 2;

		if (charArray.length % 3 == 2)
			j = 1;

		System.out.println(String.format("Число %s в бухгалтерском формате: ", number));
		for (int i = 0; i < charArray.length; i++) {

			if ((j % 3 == 0) && j != 0)
				System.out.print(" ");
			System.out.print(charArray[i]);
			j++;
		}

	}
}
