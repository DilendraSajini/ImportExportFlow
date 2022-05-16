package app.importdata.parser.json;

import app.common.labdata.LabData;
import app.importdata.parser.ImportParser;

public class MicrobiologyImportJSONParser extends ImportParser {

	public MicrobiologyImportJSONParser(LabData importData) {
		super(importData);
	}

	@Override
	public Object getObject() {
		return "Microbiology JSON Report Object";
	}

}
