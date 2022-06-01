package app.parser.importdata.json;

import java.util.function.BiFunction;

import app.common.data.ReportData;
import app.importdata.labdata.ImportData;
import app.parser.importdata.ImportParser;

public class MicrobiologyImportJSONParser<T> extends ImportParser<T> {

	public MicrobiologyImportJSONParser(ImportData<T> importData) {
		super(importData);
	}

	@Override
	public <U> U processData(BiFunction<String, ReportData<T>, U> supplier) {
		return supplier.apply("Microbiology JSON Report Object", importData.getReportData());
	}
}
