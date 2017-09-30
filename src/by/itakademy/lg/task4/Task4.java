package by.itakademy.lg.task4;

public class Task4 {

	public static void main(String[] args) {
		int a = 2;
		int b = 1;
		int r = 1;

		int c = (a * a) + (b * b);
		int x = (int) Math.sqrt(c);
		if (r > x)
			System.out.println("Можно закрыть отверстие");
		else
			System.out.println("Нельзя закрыть отверстие");
		;

	}

}
