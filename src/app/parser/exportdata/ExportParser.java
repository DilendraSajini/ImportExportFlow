package app.parser.exportdata;

import app.common.labdata.LabData;

public abstract class ExportParser {
	
	protected LabData exportData;

	public abstract String getString();

	public ExportParser(LabData exportData) {
		super();
		this.exportData = exportData;
	}
}
