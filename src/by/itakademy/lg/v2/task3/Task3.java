package by.itakademy.lg.v2.task3;

public class Task3 {

	public static void main(String[] args) {

		String str = new String(
				"<p style=color red> hello</p><p style=color red> hello</p><p style=color red> hello</p>     <p>ghfggh</p> ");
		System.out.println(str.replaceAll("(<p [^>]+>)", "<p>"));

	}

}