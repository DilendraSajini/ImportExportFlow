package app.parser.importdata.xml;

import java.util.function.BiFunction;
import app.importdata.labdata.ImportData;
import app.parser.importdata.ImportParser;

public class ChemistryImportXMLParser<T> extends ImportParser<T> {

	public ChemistryImportXMLParser(ImportData<T> importData) {
		super(importData);
	}

	// contains parsing logic according to different speciality. usage of xsd
	// generated files.
	@Override
	public <U> U processData(BiFunction<String, T, U> supplier) {
		return supplier.apply("Chemistry XML Report Object", importData.getReportData().getImportData());
	}

}
