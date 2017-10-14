package by.itakademy.lg.task23;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		ArrayList<Slot> slots = new ArrayList<>();
		slots.add(new Slot(100, 10));
		slots.add(new Slot(50, 1));
		slots.add(new Slot(10, 1));

		ATM atm = new ATM(slots);

		atm.cacheOut(900);
		atm.cacheOut(100);
		atm.cacheOut(50);
		atm.cacheOut(50);
	}

}