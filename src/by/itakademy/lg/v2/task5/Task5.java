package by.itakademy.lg.v2.task5;

import java.util.Locale;
import java.util.ResourceBundle;

public class Task5 {

	public static void main(String[] args) {
		String lang = args[0];
		String country = args[1];
		Locale localeDefault = Locale.getDefault();
		Locale locale = new Locale(lang, country);

		ResourceBundle rb1 = ResourceBundle.getBundle("MessagesBundle",
				locale);
		System.out.println(locale);
		System.out.println(localeDefault);
		System.out.println(rb1.getString("test"));
	}

}
