package app.parser.importdata.json;

import java.util.function.BiFunction;

import app.common.persistable.PersistableData;
import app.importdata.labdata.ImportData;
import app.parser.importdata.ImportParser;

public class ChemistryImportJSONParser<T> extends ImportParser<T> {

	public ChemistryImportJSONParser(ImportData<T> importData) {
		super(importData);
	}

	@Override
	public PersistableData processData(BiFunction<String, T, PersistableData> supplier) {
		return processData("Chemistry JSON Report Object", supplier);
	}
}
