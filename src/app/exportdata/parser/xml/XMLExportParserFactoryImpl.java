package app.exportdata.parser.xml;

import app.common.labdata.LabData;
import app.exportdata.parser.ExportParser;
import app.exportdata.parser.ExportParserFactory;

public class XMLExportParserFactoryImpl implements ExportParserFactory {

	@Override
	public ExportParser getParser(int speciality, LabData exportData) {
		if (speciality == 1) {
			return new ChemistryExportXMLParser(exportData);
		}
		return new MicrobiologyExportXMLParser(exportData);
	}

}
