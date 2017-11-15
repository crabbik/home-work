package by.itakademy.lg.home.task1;

public class Weight {
	private int unit;
	private double number;

	private double kg;
	private double gramm;
	private double lb;
	private double carat;

	public Weight(int unit, int number) {
		super();
		this.unit = unit;
		this.number = number;
	}

	public void converter() {

		if (unit == 1) {
			this.number = this.number * 0.001;
		} else if (unit == 2) {
			gramm = this.number;
		} else if (unit == 3) {
			this.number = this.number * 0.00220462;
		} else if (unit == 4) {
			this.number = this.number * 0.2;
		}
		kg = this.number * 0.001;
		gramm = this.number;
		lb = this.number * 0.00220462;
		carat = this.number * 0.2;

		System.out
				.println(String.format("кг = %s; \nграмм(ов) = %s;\nфунт(ов) = %s;\nкарат = %s", kg, gramm, lb, carat));
	}

}
