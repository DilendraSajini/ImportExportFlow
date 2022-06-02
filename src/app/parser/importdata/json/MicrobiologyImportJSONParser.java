package app.parser.importdata.json;

import java.util.function.BiFunction;

import app.common.persistable.PersistableData;
import app.importdata.labdata.ImportData;
import app.parser.importdata.ImportParser;

public class MicrobiologyImportJSONParser<T> extends ImportParser<T> {

	public MicrobiologyImportJSONParser(ImportData<T> importData) {
		super(importData);
	}

	@Override
	public PersistableData processData(BiFunction<String, T, PersistableData> supplier) {
		return processData("Microbiology JSON Report Object", supplier);
	}
}
