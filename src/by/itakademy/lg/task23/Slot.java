package by.itakademy.lg.task23;

public class Slot {
	private Integer nominal;
	private Integer quantity;

	public Integer getNominal() {
		return nominal;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public Slot(Integer nominal, Integer quantity) {
		super();
		this.nominal = nominal;
		this.quantity = quantity;
	}

	public SlotResult takeMoney(int summ) {
		int q = summ / nominal;

		if (q > this.quantity) {
			q = 0;
		}

		return new SlotResult(this.nominal, q);
	}

	public void addQuantity(Integer nom) {
		this.quantity = this.quantity + nom;

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

}
