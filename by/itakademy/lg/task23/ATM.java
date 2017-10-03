package by.itakademy.lg.task23;

public class ATM {
	Integer count20 = 0;
	Integer count50 = 0;
	Integer count100 = 0;

	public void addCount20(Integer add20) {
		this.count20 += add20;

	}

	public int getCount20() {
		return count20;
	}

	public void addCount50(Integer add50) {
		this.count50 += add50;

	}

	public int getCount50() {
		return count50;
	}

	public void addCount100(Integer add100) {
		this.count100 += add100;

	}

	public int getCount100() {
		return count100;
	}

	public boolean cashOut(Integer cash) {
		if (getBalance() < cash) {
			return false;
		} else if ((cash % 20 != 0) && (cash % 50 != 0) && (cash % 100 != 0)) {
			return false;

		}
		// Дописать тут условия по купюрам и их количеству
		else {
			return true;
		}

	}

	ATM(int count20, int count50, int count100) {
		this.count20 = +count20;
		this.count50 = +count50;
		this.count100 = +count100;

	}

	public int getBalance() {
		return (count20 * 20) + (count50 * 50) + (count100 * 100);
	}

}
