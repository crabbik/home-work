package by.itakademy.lg.task19;

public class Task19 {

	public static void main(String[] args) {
		// ����� ��������� ����� ������ � �� �������
		String str = "���������, ������, � �����������,, ��������.";
		int n = 0;
		char symbol;
		for (int i = 0; i < str.length(); i++) {
			symbol = str.charAt(i);
			if (symbol == ' ')
				n++;

		}
		System.out.println("� ��� ���� " + n + " ��������");
	}

}