package by.itakademy.lg.v2.task11stax;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

public class Task11 {
	// Отработало нормально, но не совсем понятен механизм
	public static void main(String[] args) {
		String fileName = "D:\\eclipse-workspace\\home-work\\src\\by\\itakademy\\lg\\v2\\task7_9\\Task7.xml";
		boolean isX = false;
		boolean isY = false;
		boolean isUnit = false;
		XMLInputFactory factory = XMLInputFactory.newFactory();
		try {
			XMLStreamReader reader = factory.createXMLStreamReader(new FileInputStream(fileName));
			while (reader.hasNext()) {
				int res = reader.next();
				if (res == reader.START_ELEMENT) {
					if (reader.getLocalName().equals("x")) {
						isX = true;
					} else if (reader.getLocalName().equals("y")) {
						isY = true;
					} else if (reader.getLocalName().equals("unit")) {
						isUnit = true;
					}
				} else if (res == reader.CHARACTERS) {
					if (isX) {
						System.out.print(reader.getText());
						isX = false;
					}
					if (isY) {
						System.out.print(" " + reader.getText());
						isY = false;
					}
					if (isUnit) {
						System.out.println(" " + reader.getText());
						isUnit = false;
					}

				}

			}

		}

		catch (FileNotFoundException | XMLStreamException e) {
			e.printStackTrace();

		}
	}
}