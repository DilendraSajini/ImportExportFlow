package app.exportdata.parser.xml;
import app.common.labdata.LabData;
import app.exportdata.parser.ExportParser;

public class MicrobiologyExportXMLParser extends ExportParser {

	public MicrobiologyExportXMLParser(LabData exportData) {
		super(exportData);
	}

	@Override
	public String getString() {
		return "Microbiology Request XML";
	}

}
