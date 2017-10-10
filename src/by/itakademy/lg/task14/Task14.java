package by.itakademy.lg.task14;

public class Task14 {

	public static void main(String[] args) {
		int marks[] = new int[20];
		for (int i = 0; i < marks.length; i++) {
			marks[i] = (int) (Math.random() * 100);
		}
		int maxMark = marks[0];
		int x = 0;
		for (int i = 0; i < marks.length; i++) {
			if (maxMark < marks[i]) {
				x = i;
				maxMark = marks[i];
			}

		}
		System.out.println(x);

	}

}