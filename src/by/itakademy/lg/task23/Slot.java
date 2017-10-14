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
	public SlotResult takeMoney(int summ){
		int q= summ/nominal;
		if(q>this.quantity){
			q=0;
		}
		return SlotResult(this.nominal,q);
	}

	@Override
	public String toString() {
		return "Slot [nominal=" + nominal + ", quantity=" + quantity + "]";
	}
	



}
