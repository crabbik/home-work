package by.itakademy.lg.task15;

public class Task15 {

	public static void main(String[] args) {
		// Надо найти сумму между двумя элементами. где расположен мин и мах
		// нашел

		int marks[] = { 1, 7, 2, 78, 3, 3, 7, 9, 43, 5, 6, 4, 3, 7, 4, 8 };

		int maxMark = marks[0];
		int x = 0;
		for (int i = 0; i < marks.length; i++) {
			if (maxMark < marks[i]) {
				maxMark = marks[i];
				x = i;
			}

		}
		int minMark = marks[0];
		int c = 0;
		for (int a = 0; a < marks.length; a++) {
			if (minMark > marks[a]) {
				minMark = marks[a];
				c = a;
			}

		}

		System.out.println(maxMark);
		System.out.println(x);
		System.out.println(minMark);
		System.out.println(c);
	}

}
