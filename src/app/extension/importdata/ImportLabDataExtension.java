package app.extension.importdata;

import app.common.extension.LabDataExtension;
import app.importdata.labdata.ImportData;
import app.importdata.persistable.PersistableData;

public abstract class ImportLabDataExtension<T> implements LabDataExtension{
	
	protected ImportData<T> importData;
	
	public abstract PersistableData<T> getPersistableData();
	
	public ImportLabDataExtension(ImportData<T> importData) {
		this.importData = importData;
	}
}
