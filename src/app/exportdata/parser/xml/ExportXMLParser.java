package app.exportdata.parser.xml;

import app.exportdata.labdata.ExportData;

public abstract class ExportXMLParser {

	ExportData exportData;
	
	public void setData(ExportData exportData) {
		this.exportData = exportData;
	}

	public abstract String getXMLString();
}
