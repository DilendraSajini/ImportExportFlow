package app.parser.importdata.xml;

import app.common.labdata.LabData;

public abstract class ImportXMLParser {

	LabData importData;

	public abstract Object getObject();

	public void setData(LabData importData) {
		this.importData = importData;
	}
}
