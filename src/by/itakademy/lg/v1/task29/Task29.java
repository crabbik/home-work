package by.itakademy.lg.v1.task29;

import java.util.HashMap;
import java.util.Map;

public class Task29 {

	public static void main(String[] args) {

		String text = "Жизнь и Смерть. Что мы знаем о них? Немного. ";
		Map<String, Integer> map = new HashMap<String, Integer>();

		String[] str1 = text.split(" ");

		for (String word : str1) {
			Integer count = map.get(word);

			if (map.containsKey(word)) {
				map.put(word, count + 1);
			} else {
				map.put(word, 1);
			}

		}
		System.out.println(map);

	}
}
