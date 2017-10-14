package by.itakademy.lg.task23;

import java.util.ArrayList;


public class Test {

	public static void main(String[] args) {
		ArrayList<Slot> slots = new ArrayList<>();
		slots.add(new Slot(100, 30));
		slots.add(new Slot(50, 60));
		slots.add(new Slot(10, 50));

		ATM atm = new ATM(slots);

		atm.cacheOut(520);

	}

}