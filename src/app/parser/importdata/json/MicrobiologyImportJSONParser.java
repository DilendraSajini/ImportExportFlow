package app.parser.importdata.json;

import app.importdata.labdata.ImportData;
import app.parser.importdata.ImportParser;

public class MicrobiologyImportJSONParser<T> extends ImportParser<T> {

	public MicrobiologyImportJSONParser(ImportData<T> importData) {
		super(importData);
	}

	@Override
	public Object getObject() {
		return "Microbiology JSON Report Object";
	}

}
