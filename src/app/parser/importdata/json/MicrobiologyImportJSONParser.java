package app.parser.importdata.json;

import java.util.function.BiFunction;

import app.importdata.labdata.ImportData;
import app.parser.importdata.ImportParser;

public class MicrobiologyImportJSONParser<T> extends ImportParser<T> {

	public MicrobiologyImportJSONParser(ImportData<T> importData) {
		super(importData);
	}

	@Override
	public <U> U processData(BiFunction<String, T, U> supplier) {
		return processData("Microbiology JSON Report Object", supplier);
	}
}
