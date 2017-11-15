package by.itakademy.lg.home.task2;

public class Task2 {

	public static void main(String[] args) {

		int a[] = { 1, 2, 4, 7, 9 };
		int b[] = { 2, 3, 5, 7, 8 };
		int c[] = { 2, 5, 7, 8, 15 };

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				int sum = a[i] + b[j];
				for (int y = 0; y < c.length; y++) {
					if (sum == c[y]) {
						System.out.println(String.format("%s + %s = %s", a[i], b[j], c[y]));

					}
				}
			}

		}

	}

}
