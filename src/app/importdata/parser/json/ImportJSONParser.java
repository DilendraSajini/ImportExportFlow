package app.importdata.parser.json;

import app.common.labdata.LabData;

public abstract class ImportJSONParser {

	LabData importData;

	public abstract Object getObject();

	public void setData(LabData importData) {
		this.importData = importData;
	}
}
