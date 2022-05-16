package app.exportdata.parser.json;

import app.common.labdata.LabData;

public abstract class ExportJSONParser {

	LabData exportData;

	public void setData(LabData exportData) {
		this.exportData = exportData;
	}

	public abstract String getString();
}
