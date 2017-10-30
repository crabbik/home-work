package by.itakademy.lg.v1.task33;

import java.io.File;

public class Task33 {

	public static <E> void main(String[] args) {
		File folder = new File("C:/Windows");
		File[] listFiles = folder.listFiles();
		for (File file : listFiles) {
			System.out.println(String.format("name %s; siDirectory %s; size %s", file.getName(), file.isDirectory(), file.length()));

		}

	}

}
