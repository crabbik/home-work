package by.itakademy.lg.task26;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task26 {

	public static void main(String[] args) {
		List<Mark> listPoints = new ArrayList<Mark>();

		for (int i = 0; i < 20; i++) {
			Random random = new Random();
			listPoints.add(new Mark("User " + i, i, random.nextInt((5) + 1)));

		}
		System.out.println(listPoints);

		for (Mark point : listPoints) {
			if (point.getMark() < 3) {
				listPoints.remove(point);
			}
		}
		System.out.println(listPoints);
	}

}
