package app.parser.importdata.json;

import app.importdata.labdata.ImportData;
import app.parser.importdata.ImportParser;
import app.parser.importdata.ImportParserFactory;

public class JSONImportParserFactoryImpl<T> implements ImportParserFactory<T> {

	@Override
	public ImportParser<T> getParser(int speciality, ImportData<T> importData) {
		if (speciality == 1) {
			return new ChemistryImportJSONParser<>(importData);
		}
		return new MicrobiologyImportJSONParser<>(importData);
	}

}
