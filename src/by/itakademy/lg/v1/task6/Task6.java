package by.itakademy.lg.v1.task6;

public class Task6 {

	public static void main(String[] args) {
		// не доконца доделал проверку по количеству дней в месяце,
		int day = 30;
		int month = 5;
		int year = 1991;

		nextDay(day, month, year);

	}

	public static void nextDay(int day, int month, int year) {
		boolean a = valid(day, month);
		if (a) {

			if (month == 12 && day == 31) {
				day = 1;
				month = 1;
				year++;

			} else if (day == 31 || month == 1 && month == 3 && month == 5 && month == 7 && month == 8 && month == 10
					&& month == 12) {
				month++;
				day = 1;
			} else if (day == 28 && month == 2) {
				month++;
				day = 1;
			} else if (day == 30 || month == 4 && month == 6 && month == 9 && month == 11) {
				month++;
				day = 1;
			} else {
				day++;
			}
			System.out.println("Следующий день  " + day + "." + month + "." + year);

		}

		else {
			System.out.println("Некорректные данные ");
		}
	}

	public static Boolean valid(int day, int month) {

		if (month < 1 || month > 12) {
			return false;
		}

		if (day > 0 || day < 32
				|| month == 1 && month == 3 && month == 5 && month == 7 && month == 8 && month == 10 && month == 12) {
			return true;
		}

		if (month == 2 && day > 0 && day < 29) {
			return true;
		}

		if (month == 4 && month == 6 && month == 9 && month == 11 || day < 31 || day > 0) {
			return true;
		}
		return false;
	}

}
