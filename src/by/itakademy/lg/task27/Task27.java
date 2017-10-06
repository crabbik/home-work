package by.itakademy.lg.task27;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task27 {

	public static void main(String[] args) {
		List<Integer> listPoints = new ArrayList<Integer>();
		listPoints.add(1);
		listPoints.add(5);
		listPoints.add(2);
		listPoints.add(3);
		listPoints.add(1);
		listPoints.add(5);
		listPoints.add(3);
		listPoints.add(3);
		listPoints.add(3);
		Set<Integer> hs = new HashSet<>();

		hs.addAll(listPoints);
		System.out.println(hs);
		// "Данный вариант разрушает порядок в изначальной коллекции.
		// Пробовал listPoints.contains(), но не получалось "
	}
}
