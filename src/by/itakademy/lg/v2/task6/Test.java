package by.itakademy.lg.v2.task6;

import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;

public class Test {

	public static void main(String[] args) throws FileNotFoundException,
			UnsupportedEncodingException {
		Logger log = Logger.getLogger();
		log.log("Первая ошибка");
		log.log("2 ошибка");
		log.log("3 ошибка");
		log.log("4 ошибка");
		log.log("5 ошибка");
		log.closeWrite();

	}
}
