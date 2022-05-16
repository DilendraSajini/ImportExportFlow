package app.importdata.extension;

import app.common.extension.LabDataExtension;
import app.importdata.labdata.ImportData;

public abstract class ImportLabDataExtension<T> implements LabDataExtension{
	
	protected ImportData<T> importData;
	
	public abstract Object getObject();
	
	public ImportLabDataExtension(ImportData<T> importData) {
		this.importData = importData;
	}
}
