package by.itakademy.lg.task26;

import java.util.ArrayList;
import java.util.List;

public class Task26 {

	public static void main(String[] args) {
		List<Integer> listPoints = new ArrayList<Integer>();
		listPoints.add(1);
		listPoints.add(5);
		listPoints.add(2);
		listPoints.add(4);
		listPoints.add(3);
		listPoints.add(1);
		listPoints.add(3);
		listPoints.add(5);
		listPoints.add(2);
		for (int i = 0; i<listPoints.size(); i++) {
			if (listPoints.get(i)<3) {
				listPoints.remove(i);
			}
			
		}
		System.out.println(listPoints);

	}

}
