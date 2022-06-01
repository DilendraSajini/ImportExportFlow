package app.parser.importdata.json;

import java.util.function.BiFunction;

import app.importdata.labdata.ImportData;
import app.parser.importdata.ImportParser;

public class ChemistryImportJSONParser<T> extends ImportParser<T> {

	public ChemistryImportJSONParser(ImportData<T> importData) {
		super(importData);
	}

	@Override
	public <U> U processData(BiFunction<String, T, U> supplier) {
		return supplier.apply("Chemistry JSON Report Object", importData.getReportData().getImportData());
	}
}
