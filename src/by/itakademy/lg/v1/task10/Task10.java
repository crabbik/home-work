package by.itakademy.lg.v1.task10;

public class Task10 {

	public static void main(String[] args) {

		int i = 147;
		int sum = 0;

		while (i != 0) {

			sum = sum + (i % 10);
			i = i / 10;

		}
		System.out.println(sum);

	}

}