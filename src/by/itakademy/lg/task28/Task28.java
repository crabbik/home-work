package by.itakademy.lg.task28;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Task28 {

	public static void main(String[] args) {
		List<Mark> listPoints = new ArrayList<Mark>();

		for (int i = 0; i < 20; i++) {
			Random random = new Random();
			listPoints.add(new Mark("User " + i, i, random.nextInt((5) + 1)));

		}
		System.out.println(listPoints);

		Iterator<Mark> iterator = listPoints.iterator();

		Mark max = listPoints.get(0);

		while (iterator.hasNext()) {
			Mark next = iterator.next();
			if (max.getMark() < next.getMark()) {
				max = next;

			}

		}
		System.out.println(max);

	}
}