package app.parser.exportdata.xml;
import app.common.labdata.LabData;
import app.parser.exportdata.ExportParser;

public class MicrobiologyExportXMLParser extends ExportParser {

	public MicrobiologyExportXMLParser(LabData exportData) {
		super(exportData);
	}

	@Override
	public String getString() {
		return "Microbiology Request XML";
	}

}
