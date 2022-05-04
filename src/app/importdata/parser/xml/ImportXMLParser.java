package app.importdata.parser.xml;

import app.importdata.labdata.ImportData;

public abstract class ImportXMLParser {

	ImportData importData;

	public abstract Object getObject();

	public void setData(ImportData importData) {
		this.importData = importData;
	}
}
