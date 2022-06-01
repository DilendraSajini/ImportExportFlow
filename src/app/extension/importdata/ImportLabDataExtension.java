package app.extension.importdata;

import java.util.function.BiFunction;

import app.common.data.ReportData;
import app.common.extension.LabDataExtension;
import app.importdata.labdata.ImportData;

public abstract class ImportLabDataExtension<T> implements LabDataExtension {

	protected ImportData<T> importData;

	public ImportLabDataExtension(ImportData<T> importData) {
		this.importData = importData;
	}

	public abstract <U> U processData(BiFunction<String, ReportData<T>, U> supplier);
}
