package app.extension.exportdata;

import app.common.extension.LabDataExtension;
import app.exportdata.labdata.ExportData;

public abstract class ExportLabDataExtension implements LabDataExtension{

	protected ExportData exportData;
	
	public abstract String getString();

	public ExportLabDataExtension(ExportData exportData) {
		this.exportData = exportData;
	}
}
