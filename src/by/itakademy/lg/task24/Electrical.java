package by.itakademy.lg.task24;

public class Electrical extends Devices {
	private int voltage;
	private int power;

	public int getVoltage() {
		return voltage;
	}

	public void setVoltage(int voltage) {
		this.voltage = voltage;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public boolean state = false;

	public void on() {
		state = true;
	}

	public void off() {
		state = false;
	}

	public void printState() {

		if (state) {
			System.out.println("Прибор включен");
		} else {
			System.out.println("Прибор выключен");

		}
	}

}
