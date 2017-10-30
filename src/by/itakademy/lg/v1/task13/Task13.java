package by.itakademy.lg.v1.task13;

public class Task13 {

	public static void main(String[] args) {
		int n = 17;
		int i;
		boolean isComposite = false;
		for (i = 2; i < n; i++) {
			if (n % i == 0) {
				isComposite = true;
				break;
			}
		}
		if (isComposite) {
			System.out.println("Число составное ");
		} else {
			System.out.println("Число простое");
		}
	}

}
