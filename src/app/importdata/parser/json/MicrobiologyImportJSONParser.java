package app.importdata.parser.json;

import app.importdata.labdata.ImportData;
import app.importdata.parser.ImportParser;

public class MicrobiologyImportJSONParser<T> extends ImportParser<T> {

	public MicrobiologyImportJSONParser(ImportData<T> importData) {
		super(importData);
	}

	@Override
	public Object getObject() {
		return "Microbiology JSON Report Object";
	}

}
