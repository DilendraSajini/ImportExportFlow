package app.parser.exportdata.json;

import app.common.labdata.LabData;
import app.parser.exportdata.ExportParser;

public class ChemistryExportJSONParser extends ExportParser{

	public ChemistryExportJSONParser(LabData exportData) {
		super(exportData);
	}

	@Override
	public String getString() {
		return "Chemistry Request JSON";
	}
}
