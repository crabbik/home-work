package by.itakademy.lg.task23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ATM {

	private List<Slot> slotAtm = new ArrayList<Slot>();

	public List<Slot> getSlotAtm() {
		return slotAtm;
	}

	public ATM(List<Slot> slotAtm) {
		super();
		this.slotAtm = slotAtm;
	}

	public boolean cacheOut(int summ) {

		ArrayList<SlotResult> results = new ArrayList<>();
		for (Slot slot : slotAtm) {
			SlotResult slotResult = slot.takeMoney(summ);
			results.add(slotResult);
			summ -= slotResult.getNom() * slotResult.getSum();
		}

		if (summ == 0) {
			for (SlotResult slotResult : results) {
				for (Slot slot : slotAtm) {
					if (slotResult.getNom() == slot.getNominal()) {
						// TODO remove money
					}
				}

			}

			System.out.println("Success:" + Arrays.toString(results.toArray()));

			return true;
		} else {
			System.out.println("Fail. can't execute operation");
			return false;
		}

	}

}