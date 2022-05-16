package app.importdata.parser.xml;

import app.common.labdata.LabData;
import app.importdata.parser.ImportParser;

public class MicrobiologyImportXMLParser extends ImportParser {

	public MicrobiologyImportXMLParser(LabData importData) {
		super(importData);
	}

	@Override
	public Object getObject() {
		return "Microbiology XML Report Object";
	}
}
