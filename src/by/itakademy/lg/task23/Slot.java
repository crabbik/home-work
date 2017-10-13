package by.itakademy.lg.task23;

import java.util.List;

public class Slot {
	private Integer nominal;
	private Integer quantity;

	public Integer getNominal() {
		return nominal;
	}

	public void setNominal(Integer nominal) {
		this.nominal = nominal;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Slot(Integer nominal) {
		super();
		this.nominal = nominal;

	}

	public void addQuantity(Integer nom) {
		this.quantity = this.quantity+nom;

	}

	public boolean isApplicable(Integer nom) {
		if (this.nominal == nom) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "Slot [nominal=" + nominal + ", quantity=" + quantity + "]";
	}
	
	public SlotResult cashOut(Integer sum, List<Slot> slot) {
		if (sum != 30 && sum != 10) {
			SlotResult res = new SlotResult();
			for (Slot slot2 : slot) {
				res.search(sum, slot2);
			}

			return res;
		} else {

			return null;
		}
	}


}
