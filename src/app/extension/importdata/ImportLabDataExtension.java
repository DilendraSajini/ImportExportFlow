package app.extension.importdata;

import java.util.function.BiFunction;

import app.common.extension.LabDataExtension;
import app.common.persistable.PersistableData;
import app.importdata.labdata.ImportData;

public abstract class ImportLabDataExtension<T> implements LabDataExtension {

	protected ImportData<T> importData;

	public ImportLabDataExtension(ImportData<T> importData) {
		this.importData = importData;
	}

	public abstract PersistableData processData(BiFunction<String, T, PersistableData> supplier);
}
