package by.itakademy.lg.v1.task11;

public class Task11 {

	public static void main(String[] args) {
		int n = 18;
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
