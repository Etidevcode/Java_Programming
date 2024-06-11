/*
 * Created by Etienne KOA
 */

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;

public class ModifyXMLFileJava {

	public static void main(String[] args) {

		String filePath = "Extra_Information/Java-XML/java-dom-parser/xml/users.xml";
		File xmlFile = new File(filePath);

		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder;

		try {

			builder = factory.newDocumentBuilder();

			// parse xml file and load into document
			Document doc = builder.parse(xmlFile);

			doc.getDocumentElement().normalize();

			// Update Element Value
			updateElementValue(doc);

			// delete element
			deleteElement(doc);

			// add new Element
			addElement(doc);

			// Write the updated document to file or console
			writeXMLFile(doc);

		} catch (SAXException | ParserConfigurationException | IOException | TransformerException e) {
			e.printStackTrace();
		}
	}

	private static void writeXMLFile(Document doc) throws TransformerFactoryConfigurationError, TransformerConfigurationException, TransformerException{

		doc.getDocumentElement().normalize();
		TransformerFactory transformerFactory = TransformerFactory.newInstance();
		Transformer transformer = transformerFactory.newTransformer();
		DOMSource source = new DOMSource(doc);
		StreamResult result = new StreamResult(new File("Extra_Information/Java-XML/java-dom-parser/xml/users_updated.xml"));
		transformer.setOutputProperty(OutputKeys.INDENT, "yes");
		transformer.transform(source, result);
		System.out.println("XML file updated successfully");
	}


	private static void addElement(Document doc){

		NodeList users = doc.getElementsByTagName("User");
		Element emp = null;

		// Loop for each user
		for (int i = 0; i < users.getLength(); i++){
			emp = (Element) users.item(i);
			Element salaryElement = doc.createElement("salary");
			salaryElement.appendChild(doc.createTextNode("10000"));
			emp.appendChild(salaryElement);
		}
	}

	private static void deleteElement(Document doc){
		NodeList users = doc.getElementsByTagName("User");
		Element user = null;

		// loop for each user
		for (int i = 0; i < users.getLength(); i++){
			user = (Element) users.item(i);
			Node genderNode = user.getElementsByTagName("gender").item(0);
			user.removeChild(genderNode);
		}
	}

	private static void updateElementValue(Document doc){
		NodeList users = doc.getElementsByTagName("User");
		Element user = null;

		// loop for each user
		for (int i = 0; i < users.getLength(); i++){
			user = (Element) users.item(i);
			Node name = user.getElementsByTagName("firstName").item(0).getFirstChild();
			name.setNodeValue(name.getNodeValue().toUpperCase());
		}
	}
}
