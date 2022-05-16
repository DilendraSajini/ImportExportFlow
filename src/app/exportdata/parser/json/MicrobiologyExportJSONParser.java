package app.exportdata.parser.json;

import app.common.labdata.LabData;
import app.exportdata.parser.ExportParser;

public class MicrobiologyExportJSONParser extends ExportParser {

	public MicrobiologyExportJSONParser(LabData exportData) {
		super(exportData);
	}

	@Override
	public String getString() {
		return "Microbiology Request JSON";
	}

}
