package app.importdata.extension.json;

import app.importdata.extension.ImportLabDataExtension;
import app.importdata.labdata.ImportData;
import app.importdata.parser.JSONImportParserFactory;
import app.importdata.parser.json.ImportJSONParser;
import app.importdata.parser.json.JSONImportParserFactoryImpl;

public class ImportJSONExtension<T> implements ImportLabDataExtension {

	private ImportJSONParser parser;

	private ImportData importData;

	public ImportJSONExtension(ImportData importData) {
		super();
		this.importData = importData;
		JSONImportParserFactory jsonParserFactory = new JSONImportParserFactoryImpl();
		parser = jsonParserFactory.getJSONParser(this.importData.getSpeciality());
		parser.setData(this.importData);
	}

	public Object getObject() {
		return parser.getObject();
	}

}
