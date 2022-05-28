package app.parser.importdata.xml;

import app.importdata.labdata.ImportData;
import app.parser.importdata.ImportParser;
import app.parser.importdata.ImportParserFactory;

public class XMLImportParserFactoryImpl<T> implements ImportParserFactory<T> {

	@Override
	public ImportParser<T> getParser(int speciality, ImportData<T> importData) {
		if (speciality == 1) {
			return new ChemistryImportXMLParser<>(importData);
		}
		return new MicrobiologyImportXMLParser<>(importData);
	}

}
