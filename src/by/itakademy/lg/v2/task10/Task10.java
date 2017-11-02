package by.itakademy.lg.v2.task10;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class Task10 {

	public static void main(String[] args) throws ParserConfigurationException,
			SAXException, IOException {

		File inputFile = new File(
				"C:/Users/user/workspace/sample-gls/src/xmlparser/Task7.xml");
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		Document doc = dBuilder.parse(inputFile);
		Element pointNodes = doc.getDocumentElement();
		NodeList points = doc.getElementsByTagName("point");
		for (int i = 0; i < points.getLength(); i++) {
			Node point = points.item(i);
			Element eElement = (Element) point;
			String xVaue = getTagVaue(eElement, "x");
			String yVaue = getTagVaue(eElement, "y");
			String unitVaue = getTagVaue(eElement, "unit");
			System.out.println(String.format("%s %s,%s %s", xVaue,unitVaue,yVaue,unitVaue));

		}

	}

	private static String getTagVaue(Element eElement, String tagName) {
		NodeList namePointx = eElement.getElementsByTagName(tagName);
		String xValue = namePointx.item(0).getTextContent();
		return xValue;
	}
}