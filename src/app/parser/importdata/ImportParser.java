package app.parser.importdata;

import java.util.function.BiFunction;

import app.common.persistable.PersistableData;
import app.importdata.labdata.ImportData;

public abstract class ImportParser<T> {

	protected ImportData<T> importData;

	public ImportParser(ImportData<T> importData) {
		this.importData = importData;
	}

	public abstract PersistableData processData(BiFunction<String, T, PersistableData> supplier);
	
	protected PersistableData processData(String outputMsg, BiFunction<String, T, PersistableData> supplier) {
		return supplier.apply(outputMsg, importData.getReportData().getImportData());
	}
}
