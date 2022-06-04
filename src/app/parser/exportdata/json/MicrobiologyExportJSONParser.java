package app.parser.exportdata.json;

import java.util.function.Function;

import app.common.labdata.LabData;
import app.common.persistable.PersistableData;
import app.parser.exportdata.ExportParser;

public class MicrobiologyExportJSONParser extends ExportParser {

	public MicrobiologyExportJSONParser(LabData exportData) {
		super(exportData);
	}

	@Override
	public PersistableData processData(Function<String, PersistableData> supplier) {
		return supplier.apply("Microbiology Request JSON");
	}

}
