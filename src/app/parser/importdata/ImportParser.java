package app.parser.importdata;

import app.importdata.labdata.ImportData;
import app.importdata.persistable.PersistableData;

public abstract class ImportParser<T> {
	
	protected ImportData<T> importData;

	public abstract PersistableData<T> getObject();

	public ImportParser(ImportData<T> importData) {
		this.importData = importData;
	}
}
