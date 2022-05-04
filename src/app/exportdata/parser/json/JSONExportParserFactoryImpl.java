package app.exportdata.parser.json;

import app.exportdata.parser.JSONExportParserFactory;

public class JSONExportParserFactoryImpl implements JSONExportParserFactory {

	@Override
	public ExportJSONParser getJSONParser(int speciality) {
		if (speciality == 0) {
			return new ChemistryExportJSONParser();
		}
		return new MicrobiologyExportJSONParser();
	}

}
