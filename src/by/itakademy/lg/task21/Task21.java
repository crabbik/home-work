package by.itakademy.lg.task21;

public class Task21 {

	public static void main(String[] args) {
		String str0 = "������ ����";
		String str1 = "������ ���";
		StringBuilder strBuilder = new StringBuilder(str1);
		long timeBefore = System.currentTimeMillis();

		for (int i = 0; i <= 10; i++) {
			str0 += " ����������� ������";

		}

		long timeAfter = System.currentTimeMillis();
		long a = timeAfter - timeBefore;
		System.out.println(str0);
		System.out.println(a);
		long timeBefore1 = System.currentTimeMillis();

		for (int i = 0; i <= 3; i++) {

			strBuilder.append(" ����������� ������");

		}
		long timeAfter1 = System.currentTimeMillis();
		long b = timeAfter1 - timeBefore1;
		System.out.println(strBuilder);
		System.out.println(b);

	}

}
