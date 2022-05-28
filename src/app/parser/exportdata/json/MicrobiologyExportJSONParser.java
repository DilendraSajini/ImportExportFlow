package app.parser.exportdata.json;

import app.common.labdata.LabData;
import app.parser.exportdata.ExportParser;

public class MicrobiologyExportJSONParser extends ExportParser {

	public MicrobiologyExportJSONParser(LabData exportData) {
		super(exportData);
	}

	@Override
	public String getString() {
		return "Microbiology Request JSON";
	}

}
