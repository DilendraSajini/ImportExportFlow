package app.parser.exportdata.xml;

import app.common.labdata.LabData;

public abstract class ExportXMLParser {

	LabData exportData;
	
	public void setData(LabData exportData) {
		this.exportData = exportData;
	}

	public abstract String getString();
}
