package app.parser.json;

import app.labdata.ExportData;

public class ExportJSONParser implements JSONParser {
	ExportData exportData;
	
	public void setData(ExportData exportData) {
		this.exportData = exportData;
	}
	
	@Override
	public String getJSONString() {
		return "";
	}
}
