package by.itakademy.lg.task11;

public class Task11 {

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
			System.out.println("����� ��������� ");
		} else {
			System.out.println("�����  ������� ");
		}
	}

}
