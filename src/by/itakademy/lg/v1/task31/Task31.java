package by.itakademy.lg.v1.task31;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task31 {

	public static void main(String[] args) throws IOException {
		String str = readFile("d:/students/JavaJD1/task30.txt");
		char symbol;
		List<Integer> listNumber = new ArrayList<Integer>();
		for (int i = 0; i < str.length(); i++) {
			symbol = str.charAt(i);
			String s = String.valueOf(symbol);
			try {
				Integer number = Integer.valueOf(s);
				listNumber.add(number);
			} catch (NumberFormatException e) {

			}

		}
		int sum = 0;
		System.out.println(listNumber);
		for (Integer integer : listNumber) {
			sum += integer;
		}
		System.out.println(sum);

		Set<Integer> hs = new HashSet<>();
		hs.addAll(listNumber);
		System.out.println(hs);

	}

	static String readFile(String fileName) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(fileName));
		try {
			StringBuilder sb = new StringBuilder();
			String line = br.readLine();

			while (line != null) {
				sb.append(line);
				sb.append("\n");
				line = br.readLine();
			}
			return sb.toString();
		} finally {
			br.close();
		}
	}
}
