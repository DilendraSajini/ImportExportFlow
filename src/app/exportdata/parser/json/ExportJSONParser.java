package app.exportdata.parser.json;

import app.exportdata.labdata.ExportData;

public abstract class ExportJSONParser {

	ExportData exportData;

	public void setData(ExportData exportData) {
		this.exportData = exportData;
	}

	public abstract String getJSONString();
}
