package app.importdata.parser;

import app.common.labdata.LabData;

public abstract class ImportParser {
	
	protected LabData importData;

	public abstract Object getObject();

	public ImportParser(LabData importData) {
		super();
		this.importData = importData;
	}
}
