package by.itakademy.lg.home.task1;

import java.util.Scanner;

public class Start {

	public static void main(String[] args) {

		System.out.println("Выберите что переводить \n[1] - масса \n[2] - расстояние");
		Scanner scanner = new Scanner(System.in);
		int quantity = scanner.nextInt();
		if (quantity == 1) {
			System.out.println("Выберите величину \n[1] - кг \n[2] - грамм \n[3] - фунт \n[2] - карат");
			int unit = scanner.nextInt();
			System.out.println("Введите число");
			int number = scanner.nextInt();
			Weight weight = new Weight(unit, number);
			weight.converter();
			;

		} else if (quantity == 2) {
			System.out.println("Выберите величину \n[1] - метр \n[2] - миля \n[3] - ярд \n[2] - фут");
			int unit = scanner.nextInt();
			System.out.println("Введите число");
			int number = scanner.nextInt();
			Distance distance = new Distance(unit, number);
			distance.converter();

		} else {
			System.out.println("Ошибка.");
		}
	}

}
