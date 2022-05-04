package app.importdata.extension.json;

import app.importdata.extension.ImportLabDataExtension;
import app.importdata.labdata.ImportData;
import app.importdata.parser.XMLImportParserFactory;
import app.importdata.parser.xml.ImportXMLParser;
import app.importdata.parser.xml.XMLImportParserFactoryImpl;

public class ImportJSONExtension<T> implements ImportLabDataExtension {

	private ImportXMLParser parser;

	private ImportData importData;

	public ImportJSONExtension(ImportData importData) {
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
