package app.importdata.parser.xml;

import app.common.labdata.LabData;
import app.importdata.parser.ImportParser;
import app.importdata.parser.ImportParserFactory;

public class XMLImportParserFactoryImpl implements ImportParserFactory {

	@Override
	public ImportParser getParser(int speciality, LabData importData) {
		if (speciality == 1) {
			return new ChemistryImportXMLParser(importData);
		}
		return new MicrobiologyImportXMLParser(importData);
	}

}
