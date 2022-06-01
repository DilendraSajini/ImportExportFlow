package app.parser.exportdata.xml;

import java.util.function.Function;

import app.common.labdata.LabData;
import app.parser.exportdata.ExportParser;

public class MicrobiologyExportXMLParser extends ExportParser {

	public MicrobiologyExportXMLParser(LabData exportData) {
		super(exportData);
	}

	@Override
	public <U> U processData(Function<String, U> supplier) {
		return supplier.apply("Microbiology Request XML");
	}
}
