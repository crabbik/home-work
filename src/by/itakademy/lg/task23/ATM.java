package by.itakademy.lg.task23;

import java.util.ArrayList;
import java.util.List;

public class ATM {

	private  List<Slot> slotAtm = new ArrayList<Slot>();

	public void Atm() {

		slotAtm.add(new Slot(100));
		slotAtm.add(new Slot(50));
		slotAtm.add(new Slot(20));
	}

	public void addMoney(Integer nominal, Integer quantity) {
		for (Slot slot : slotAtm) {
			if (slot.isApplicable(nominal)) {
				slot.addQuantity(quantity);
			}
		}
	}

	public boolean cashOut(Integer sum) {

		return false;
	}

	public void informat() {
		for (Slot slot : slotAtm) {
			System.out.println("Slot " + slot.getNominal() + " count " + slot.getQuantity());
		}
	}
}