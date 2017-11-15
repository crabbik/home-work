package by.itakademy.lg.home.task1;

public class Distance {

	private int unit;
	private double number;

	private double metr;
	private double mile;
	private double yard;
	private double foot;

	Distance(int unit, int number) {
		super();
		this.unit = unit;
		this.number = number;
	}

	public void converter() {

		if (unit == 1) {
			metr = this.number;
			mile = this.number * 0.000621371;
			yard = this.number * 1.09361;
			foot = this.number * 3.28084;
		} else if (unit == 2) {
			metr = this.number * 1609.34;
			mile = this.number;
			yard = this.number * 1760;
			foot = this.number * 5280;
		} else if (unit == 3) {
			metr = this.number * 0.9144;
			mile = this.number * 0.000568182;
			yard = this.number;
			foot = this.number * 3.00000096;
		} else if (unit == 4) {
			metr = this.number * 0.3048;
			mile = this.number * 0.000189394;
			yard = this.number * 0.333333;
			foot = this.number;
		}

		System.out.println(String.format("метр(ов) = %s; \nмиля(ль) = %s; \nярд(ов) = %s;\nфут(ов) = %s", metr, mile,
				yard, foot));
	}

}
