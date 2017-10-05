package by.itakademy.lg.task15;

public class Task15 {

	public static void main(String[] args) {

		int marks[] = { 1, 7, 2, 78, 3, 3, 7, 9, 43, 5, 6, 4, 3, 7, 4, 8 };

		int maxMark = marks[0];
		int maxIndex = 0;
		for (int i = 0; i < marks.length; i++) {
			if (maxMark < marks[i]) {
				maxMark = marks[i];
				maxIndex = i;
			}

		}
		int minMark = marks[0];
		int minIndex = 0;
		for (int a = 0; a < marks.length; a++) {
			if (minMark > marks[a]) {
				minMark = marks[a];
				minIndex = a;
			}

		}
		int sum = 0;

		if (minIndex < maxIndex) {
			for (int i = minIndex + 1; i < maxIndex; i++) {
				sum += marks[i];
			}
		} else {
			for (int i = maxIndex + 1; i < minIndex; i++) {
				sum += marks[i];
			}
		}
		System.out.println(sum);
	}

}
