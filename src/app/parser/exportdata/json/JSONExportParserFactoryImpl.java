package app.parser.exportdata.json;

import app.common.labdata.LabData;
import app.parser.exportdata.ExportParser;
import app.parser.exportdata.ExportParserFactory;

public class JSONExportParserFactoryImpl implements ExportParserFactory {

	@Override
	public ExportParser getParser(int speciality, LabData exportData) {
		if (speciality == 1) {
			return new ChemistryExportJSONParser(exportData);
		}
		return new MicrobiologyExportJSONParser(exportData);
	}

}
