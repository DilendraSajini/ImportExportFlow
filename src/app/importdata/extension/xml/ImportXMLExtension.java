package app.importdata.extension.xml;

import app.importdata.extension.ImportLabDataExtension;
import app.importdata.labdata.ImportData;
import app.importdata.parser.XMLImportParserFactory;
import app.importdata.parser.xml.ImportXMLParser;
import app.importdata.parser.xml.XMLImportParserFactoryImpl;

public class ImportXMLExtension<T> implements ImportLabDataExtension {

	private ImportXMLParser parser;
	
	private ImportData importData;
	
	public ImportXMLExtension(ImportData importData) {
		super();
		this.importData = importData;
		XMLImportParserFactory xmlParserFactory = new XMLImportParserFactoryImpl();
		parser = xmlParserFactory.getXMLParser(this.importData.getSpeciality());
		parser.setData(this.importData);
	}
	
	public Object getObject() {
		return parser.getObject();	
	}

}
