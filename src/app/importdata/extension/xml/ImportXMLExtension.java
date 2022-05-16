package app.importdata.extension.xml;

import app.common.labdata.LabData;
import app.importdata.extension.ImportLabDataExtension;
import app.importdata.parser.ImportParser;
import app.importdata.parser.ImportTypeParserFactory;
import app.importdata.parser.ImportTypeParserFactoryImpl;
import main.DocType;

public class ImportXMLExtension implements ImportLabDataExtension {

	private ImportParser parser;
	
	private LabData importData;
	
	public ImportXMLExtension(LabData importData) {
		super();
		this.importData = importData;
		ImportTypeParserFactory importParserFactory = new ImportTypeParserFactoryImpl();
		parser = importParserFactory.getTypeParserFactory(DocType.XML).getParser(this.importData.getSpeciality(), importData);
	}
	
	public Object getObject() {
		return parser.getObject();	
	}

}
