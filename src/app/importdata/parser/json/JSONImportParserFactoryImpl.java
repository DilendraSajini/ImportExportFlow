package app.importdata.parser.json;

import app.importdata.labdata.ImportData;
import app.importdata.parser.ImportParser;
import app.importdata.parser.ImportParserFactory;

public class JSONImportParserFactoryImpl<T> implements ImportParserFactory<T> {

	@Override
	public ImportParser getParser(int speciality, ImportData<T> importData) {
		if (speciality == 1) {
			return new ChemistryImportJSONParser(importData);
		}
		return new MicrobiologyImportJSONParser(importData);
	}

}
