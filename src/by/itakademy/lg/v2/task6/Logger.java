package by.itakademy.lg.v2.task6;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Date;

public class Logger {

	public static Logger inst;
	private PrintWriter writer;

	private Logger() throws FileNotFoundException, UnsupportedEncodingException {
		writer = new PrintWriter("d:/students/JavaJD1/Log.txt", "UTF-8");

	}

	public void log(String message) {

		writer.println(String.format("%s %s", new Date(), message));

	}

	public static Logger getLogger() throws FileNotFoundException,
			UnsupportedEncodingException {
		if (inst == null) {
			inst = new Logger();

		}
		return inst;

	}

	public void closeWrite() {
		writer.close();
	}

}
