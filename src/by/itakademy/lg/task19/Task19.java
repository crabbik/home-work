package by.itakademy.lg.task19;

public class Task19 {

	public static void main(String[] args) {
		String str = "    ���������, ������, � �����������, �������� ";
		str = str.trim();
		String[] str1 = str.split(" +");
		int sumWord = 0;
		for (String word : str1) {
			sumWord++;

		}

		System.out.println("���������� ���� " + sumWord);
	}

}