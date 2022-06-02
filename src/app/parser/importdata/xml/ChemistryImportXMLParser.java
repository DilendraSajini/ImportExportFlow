package app.parser.importdata.xml;

import java.util.function.BiFunction;

import app.common.persistable.PersistableData;
import app.importdata.labdata.ImportData;
import app.parser.importdata.ImportParser;

public class ChemistryImportXMLParser<T> extends ImportParser<T> {

	public ChemistryImportXMLParser(ImportData<T> importData) {
		super(importData);
	}

	// contains parsing logic according to different speciality. usage of xsd
	// generated files.
	@Override
	public PersistableData processData(BiFunction<String, T, PersistableData> supplier) {
		return processData("Chemistry XML Report Object", supplier);
	}

}
