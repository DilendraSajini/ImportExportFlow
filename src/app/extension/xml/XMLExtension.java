package app.extension.xml;

import app.extension.LabDataExtension;
import app.parser.xml.XMLParserFactory;

public abstract class XMLExtension implements LabDataExtension {

	XMLParserFactory xmlParserFactory;
	
	public XMLExtension(XMLParserFactory xmlParserFactory) {
		super();
		this.xmlParserFactory = xmlParserFactory;
	}

}
