package app.parser.importdata;

import java.util.function.BiFunction;

import app.importdata.labdata.ImportData;

public abstract class ImportParser<T> {

	protected ImportData<T> importData;

	public ImportParser(ImportData<T> importData) {
		this.importData = importData;
	}

	public abstract <U> U processData(BiFunction<String, T, U> supplier);
}
