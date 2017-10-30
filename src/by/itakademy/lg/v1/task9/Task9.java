package by.itakademy.lg.v1.task9;

public class Task9 {

	public static void main(String[] args) {
		double max = 0;
		int n = 0;
		int x = (int) (Math.random() * 100);
		while (n <= 6) {
			if (x > max) {
				max = x;
			}
			n++;
			x = (int) (Math.random() * 100);
		}
		System.out.println(max);
	}

}