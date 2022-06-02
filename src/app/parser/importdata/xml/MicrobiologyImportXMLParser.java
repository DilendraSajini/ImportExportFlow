package app.parser.importdata.xml;

import java.util.function.BiFunction;

import app.common.persistable.PersistableData;
import app.importdata.labdata.ImportData;
import app.parser.importdata.ImportParser;

public class MicrobiologyImportXMLParser<T> extends ImportParser<T> {

	public MicrobiologyImportXMLParser(ImportData<T> importData) {
		super(importData);
	}

	@Override
	public PersistableData processData(BiFunction<String, T, PersistableData> supplier) {
		return processData("Microbiology XML Report Object", supplier);
	}
}
