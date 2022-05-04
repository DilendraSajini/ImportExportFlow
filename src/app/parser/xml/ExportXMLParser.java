package app.parser.xml;

import app.labdata.ExportData;

public abstract class ExportXMLParser extends XMLParser {

	ExportData exportData;
	
	public void setData(ExportData exportData) {
		this.exportData = exportData;
	}
}
