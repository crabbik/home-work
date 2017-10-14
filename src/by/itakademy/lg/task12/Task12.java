package by.itakademy.lg.task12;

public class Task12 {

	public static void main(String[] args) {
		int a = 0;
		Integer n = 2002323143;

		String nToString = n.toString();

		char[] charArray = nToString.toCharArray();
		if (charArray.length % 3 == 1) {
			a = 2;
		}
		if (charArray.length % 3 == 2) {
			a = 1;
		}

		System.out.println(String.format("Число %s в бухгалтерском формате: ",
				n));
		for (int i = 0; i < charArray.length; i++) {

			if ((a % 3 == 0) && a != 0) {
				System.out.print(" ");
				System.out.print(charArray[i]);
				a++;
			}
		}

	}
}