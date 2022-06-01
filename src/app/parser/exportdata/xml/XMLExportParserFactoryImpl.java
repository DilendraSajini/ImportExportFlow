package app.parser.exportdata.xml;

import app.common.labdata.LabData;
import app.parser.exportdata.ExportParser;
import app.parser.exportdata.ExportParserFactory;

public class XMLExportParserFactoryImpl implements ExportParserFactory {

	@Override
	public ExportParser getParser(int speciality, LabData exportData) {
		if (speciality == 1) {
			return new ChemistryExportXMLParser(exportData);
		}
		return new MicrobiologyExportXMLParser(exportData);
	}
}
