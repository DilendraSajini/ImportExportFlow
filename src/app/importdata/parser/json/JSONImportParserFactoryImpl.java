package app.importdata.parser.json;

import app.common.labdata.LabData;
import app.importdata.parser.ImportParser;
import app.importdata.parser.ImportParserFactory;

public class JSONImportParserFactoryImpl implements ImportParserFactory {

	@Override
	public ImportParser getParser(int speciality, LabData importData) {
		if (speciality == 1) {
			return new ChemistryImportJSONParser(importData);
		}
		return new MicrobiologyImportJSONParser(importData);
	}

}
