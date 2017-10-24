package by.itakademy.lg.v2.task2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {

	public static void main(String[] args) {

		String str = new String("ab15cfd 168,EAGR");
		Pattern p = Pattern.compile("[0-9A-Fa-f]+");
		Matcher m = p.matcher(str);
		while (m.find()) {
			//System.out.println(m.start() + " " + m.end());
			System.out.println(m.group());

		}
	}

}
