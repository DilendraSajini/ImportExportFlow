package app.parser.importdata.xml;

import java.util.function.BiFunction;

import app.common.data.ReportData;
import app.importdata.labdata.ImportData;
import app.parser.importdata.ImportParser;

public class MicrobiologyImportXMLParser<T> extends ImportParser<T> {

	public MicrobiologyImportXMLParser(ImportData<T> importData) {
		super(importData);
	}

	@Override
	public <U> U processData(BiFunction<String, ReportData<T>, U> supplier) {
		return supplier.apply("Microbiology XML Report Object", importData.getReportData());
	}
}
