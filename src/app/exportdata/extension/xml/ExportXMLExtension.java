package app.exportdata.extension.xml;

import app.exportdata.extension.ExportLabDataExtension;
import app.exportdata.labdata.ExportData;
import app.exportdata.parser.XMLExportParserFactory;
import app.exportdata.parser.xml.ExportXMLParser;
import app.exportdata.parser.xml.XMLExportParserFactoryImpl;

public class ExportXMLExtension implements ExportLabDataExtension{

	private ExportXMLParser parser;
	
	private ExportData exportData;
	
	public ExportXMLExtension(ExportData exportData) {
		super();
		this.exportData = exportData;
		XMLExportParserFactory xmlParserFactory = new XMLExportParserFactoryImpl();
		parser = xmlParserFactory.getXMLParser(this.exportData.getSpeciality());
		parser.setData(this.exportData);
	}	
	
	@Override
	public String getString() {	
		return parser.getXMLString();
	}

}
