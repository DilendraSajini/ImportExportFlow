package app.parser.exportdata.json;

import java.util.function.Function;

import app.common.labdata.LabData;
import app.parser.exportdata.ExportParser;

public class MicrobiologyExportJSONParser extends ExportParser {

	public MicrobiologyExportJSONParser(LabData exportData) {
		super(exportData);
	}

	@Override
	public <U> U processData(Function<String, U> supplier) {
		return supplier.apply("Microbiology Request JSON");
	}

}
