package app.exportdata.parser.json;

import app.common.labdata.LabData;
import app.exportdata.parser.ExportParser;

public class ChemistryExportJSONParser extends ExportParser{

	public ChemistryExportJSONParser(LabData exportData) {
		super(exportData);
	}

	@Override
	public String getString() {
		return "Chemistry Request JSON";
	}
}
