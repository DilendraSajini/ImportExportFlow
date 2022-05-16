package app.exportdata.extension;

import app.common.extension.LabDataExtension;
import app.common.labdata.LabData;

public abstract class ExportLabDataExtension implements LabDataExtension{

	protected LabData exportData;
	
	public abstract String getString();

	public ExportLabDataExtension(LabData exportData) {
		this.exportData = exportData;
	}
}
