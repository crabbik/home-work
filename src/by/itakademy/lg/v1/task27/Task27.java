package by.itakademy.lg.v1.task27;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Task27 {

	public static void main(String[] args) {
		List<Integer> listPoints = new ArrayList<Integer>();
		for (int i = 0; i < 20; i++) {
			Random random = new Random();
			listPoints.add((random.nextInt((5) + 1)));
		}
		System.out.println(listPoints);
		Set<Integer> hs = new HashSet<>();

		hs.addAll(listPoints);
		System.out.println(hs);

	}
}
