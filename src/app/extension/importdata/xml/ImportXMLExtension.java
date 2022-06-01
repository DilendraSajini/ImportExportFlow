package app.extension.importdata.xml;

import app.extension.importdata.ImportLabDataExtension;
import app.importdata.labdata.ImportData;
import app.importdata.persistable.PersistableData;
import app.parser.importdata.ImportParser;
import app.parser.importdata.ImportTypeParserFactory;
import app.parser.importdata.ImportTypeParserFactoryImpl;
import main.DocType;

public class ImportXMLExtension<T> extends ImportLabDataExtension<T> {

	private ImportParser<T> parser;
	
	public ImportXMLExtension(ImportData<T> importData) {
		super(importData);
		ImportTypeParserFactory<T> importParserFactory = new ImportTypeParserFactoryImpl<>();
		parser = importParserFactory.getTypeParserFactory(DocType.XML).getParser(this.importData.getSpeciality(), importData);
	}
	
	public PersistableData getPersistableData() {
		return parser.getObject();	
	}

}
