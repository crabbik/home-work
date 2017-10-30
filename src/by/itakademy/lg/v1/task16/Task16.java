package by.itakademy.lg.v1.task16;

public class Task16 {

	public static void main(String[] args) {

		int marks[] = new int[20];
		for (int i = 0; i < marks.length; i++) {
			marks[i] = (int) (Math.random() * 100);
		}
		for (int i = 0; i < marks.length; i++) {
			System.out.println("Позиция" + i + " = " + marks[i]);
		}
		for (int i = marks.length - 1; i >= 0; i--) {
			System.out.println("Позиция " + i + " = " + marks[i]);
		}

	}

}
