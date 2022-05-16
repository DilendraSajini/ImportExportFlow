package app.exportdata.parser.xml;
import app.common.labdata.LabData;
import app.exportdata.parser.ExportParser;

public class ChemistryExportXMLParser extends ExportParser{
	
	public ChemistryExportXMLParser(LabData exportData) {
		super(exportData);
	}

	// contains parsing logic according to different speciality. usage of xsd generated files.
	@Override
	public String getString() {
		return "Chemistry Request XML";
	}
}
