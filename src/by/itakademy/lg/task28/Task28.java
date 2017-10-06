package by.itakademy.lg.task28;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task28 {

	public static void main(String[] args) {
		List<Integer> listPoints = new ArrayList<Integer>();
		listPoints.add(1);
		listPoints.add(5);
		listPoints.add(2);
		listPoints.add(30);
		listPoints.add(3);
		listPoints.add(8);
		listPoints.add(3);
		listPoints.add(2);

		Iterator<Integer> iterator = listPoints.iterator();

		int max = listPoints.get(0);

		while (iterator.hasNext()) {
			int i = iterator.next();
			if (max < i) {
				max = i;

			}

		}

		System.out.println(max);

	}
}