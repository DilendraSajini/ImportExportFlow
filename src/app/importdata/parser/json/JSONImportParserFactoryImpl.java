package app.importdata.parser.json;

import app.importdata.parser.JSONImportParserFactory;

public class JSONImportParserFactoryImpl implements JSONImportParserFactory {

	@Override
	public ImportJSONParser getJSONParser(int speciality) {
		if (speciality == 0) {
			return new ChemistryImportJSONParser();
		}
		return new MicrobiologyImportJSONParser();
	}

}
