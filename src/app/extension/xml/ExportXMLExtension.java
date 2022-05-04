package app.extension.xml;

import app.labdata.ExportData;
import app.parser.xml.ExportXMLParser;
import app.parser.xml.XMLParser;
import app.parser.xml.XMLParserFactory;

public class ExportXMLExtension extends XMLExtension{

	private ExportData exportData;
	
	public ExportXMLExtension(ExportData exportData, XMLParserFactory xmlParserFactory) {
		super(xmlParserFactory);
		this.exportData = exportData;
	}	
	
	@Override
	public String getString() {
		XMLParser parser = xmlParserFactory.getXMLParser(exportData.getSpeciality());
		((ExportXMLParser) parser).setData(exportData);
		return parser.getXMLString();
	}

}
