package app.parser.exportdata.xml;
import java.util.function.Function;

import app.common.labdata.LabData;
import app.parser.exportdata.ExportParser;

public class ChemistryExportXMLParser extends ExportParser{
	
	public ChemistryExportXMLParser(LabData exportData) {
		super(exportData);
	}

	@Override
	public <U> U processData(Function<String, U> supplier) {
		return supplier.apply("Chemistry Request XML");
	}
}
