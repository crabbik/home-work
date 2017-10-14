package by.itakademy.lg.task23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ATM {

	public ATM(List<Slot> slotAtm) {
		super();
		this.slotAtm = slotAtm;
	}

	private List<Slot> slotAtm = new ArrayList<Slot>();

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

	public boolean cashOut(int summ) {

		ArrayList<SlotResult> results = new ArrayList<SlotResult>(c);
		for (Slot slot : slotAtm) {
			SlotResult slotResult = slot.takeMoney(summ);
			results.add(slotResult);
			summ -= slotResult.getNominal() * slotResult.getQantity();
		}
		if (summ == 0) {
			System.out.print("Success: " + Arrays.toString(results.toArray()));
		} else {

			return false;
		}
	}

}
