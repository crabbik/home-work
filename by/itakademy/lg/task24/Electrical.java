package by.itakademy.lg.task24;

public class Electrical extends Devices {
	public int voltage;
	public int power;
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
