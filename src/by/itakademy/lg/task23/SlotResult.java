package by.itakademy.lg.task23;

public class SlotResult {
	private Integer nom = 0;
	private Integer sum = 0;

	public void setSum(Integer sum) {
		this.sum = sum;
	}

	public void search(Integer sum, Slot slot) {
		if (sum / slot.getNominal() < slot.getQuantity()) {
			this.nom = sum / slot.getNominal();
			sum = sum - this.nom * slot.getNominal();

		} else {
			this.nom = slot.getQuantity();
			sum = sum - this.nom * slot.getNominal();
		}

	}
}