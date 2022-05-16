package app.importdata.extension.json;

import app.importdata.extension.ImportLabDataExtension;
import app.importdata.labdata.ImportData;
import app.importdata.parser.ImportParser;
import app.importdata.parser.ImportTypeParserFactory;
import app.importdata.parser.ImportTypeParserFactoryImpl;
import main.DocType;

public class ImportJSONExtension<T> extends ImportLabDataExtension<T> {

	private ImportParser<T> parser;

	public ImportJSONExtension(ImportData<T> importData) {
		super(importData);
		ImportTypeParserFactory<T> importParserFactory = new ImportTypeParserFactoryImpl<>();
		parser = importParserFactory.getTypeParserFactory(DocType.JSON).getParser(this.importData.getSpeciality(), importData);
	}

	public Object getObject() {
		return parser.getObject();
	}

}
