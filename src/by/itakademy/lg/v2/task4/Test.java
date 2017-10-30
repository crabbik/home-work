package by.itakademy.lg.v2.task4;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class Test {

	public static void main(String[] args) throws ParseException {

		Locale locale = new Locale("uk", "UA");
		NumberFormat numFormat = NumberFormat.getCurrencyInstance(locale);

		System.out.println(numFormat.format(153.5));
	}

}
