package app.exportdata.parser.json;

import app.common.labdata.LabData;
import app.exportdata.parser.ExportParser;
import app.exportdata.parser.ExportParserFactory;

public class JSONExportParserFactoryImpl implements ExportParserFactory {

	@Override
	public ExportParser getParser(int speciality, LabData exportData) {
		if (speciality == 1) {
			return new ChemistryExportJSONParser(exportData);
		}
		return new MicrobiologyExportJSONParser(exportData);
	}

}
