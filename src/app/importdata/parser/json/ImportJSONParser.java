package app.importdata.parser.json;

import app.importdata.labdata.ImportData;

public abstract class ImportJSONParser {

	ImportData importData;

	public abstract Object getObject();

	public void setData(ImportData importData) {
		this.importData = importData;
	}
}
