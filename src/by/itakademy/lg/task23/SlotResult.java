package by.itakademy.lg.task23;

public class SlotResult {
	private Integer nom = 0;
	private Integer sum = 0;

	public SlotResult(int nom, int sum) {
		super();
		this.nom = nom;
		this.sum = sum;
	}

	@Override
	public String toString() {
		return "SlotResult [nom=" + nom + ", sum=" + sum + "]";
	}

	public Integer getNom() {
		return nom;
	}

	public Integer getSum() {
		return sum;
	}
}