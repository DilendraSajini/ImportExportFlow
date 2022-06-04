package app.parser.exportdata.xml;

import java.util.function.Function;

import app.common.labdata.LabData;
import app.common.persistable.PersistableData;
import app.parser.exportdata.ExportParser;

public class MicrobiologyExportXMLParser extends ExportParser {

	public MicrobiologyExportXMLParser(LabData exportData) {
		super(exportData);
	}

	@Override
	public PersistableData processData(Function<String, PersistableData> supplier) {
		return supplier.apply("Microbiology Request XML");
	}
}
