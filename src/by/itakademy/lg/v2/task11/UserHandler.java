package by.itakademy.lg.v2.task11;

import java.util.List;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

class UserHandler extends DefaultHandler {

	private List<Point> pointsList;
	private Point currentPoint;
	private String currentTagName;

	public UserHandler(List<Point> pointsList) {
		this.pointsList = pointsList;

	}

	@Override
	public void startElement(String uri, String localName, String qName,
			org.xml.sax.Attributes attributes) throws SAXException {
		currentTagName = qName;
		if (qName.equalsIgnoreCase("point")) {
			currentPoint = new Point();
			pointsList.add(currentPoint);
		}

	}

	@Override
	public void characters(char[] ch, int start, int length)
			throws SAXException {

		String value = new String(ch, start, length);
		if (!value.matches(".+")) {
			return;
		}
		if (currentTagName.equals("x")) {
			currentPoint.setX(value);

		} else if (currentTagName.equals("y")) {
			currentPoint.setY(value);

		} else if (currentTagName.equals("unit")) {
			currentPoint.setUnit(value);

		}
	}

}