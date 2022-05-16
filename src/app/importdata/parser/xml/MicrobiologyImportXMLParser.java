package app.importdata.parser.xml;

import app.importdata.labdata.ImportData;
import app.importdata.parser.ImportParser;

public class MicrobiologyImportXMLParser<T> extends ImportParser<T> {

	public MicrobiologyImportXMLParser(ImportData<T> importData) {
		super(importData);
	}

	@Override
	public Object getObject() {
		return "Microbiology XML Report Object";
	}
}
