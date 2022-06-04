package app.parser.exportdata.xml;
import java.util.function.Function;

import app.common.labdata.LabData;
import app.common.persistable.PersistableData;
import app.parser.exportdata.ExportParser;

public class ChemistryExportXMLParser extends ExportParser{
	
	public ChemistryExportXMLParser(LabData exportData) {
		super(exportData);
	}

	@Override
	public PersistableData processData(Function<String, PersistableData> supplier) {
		return supplier.apply("Chemistry Request XML");
	}
}
