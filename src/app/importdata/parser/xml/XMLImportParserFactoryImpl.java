package app.importdata.parser.xml;

import app.importdata.parser.XMLImportParserFactory;

public class XMLImportParserFactoryImpl implements XMLImportParserFactory {

	@Override
	public ImportXMLParser getXMLParser(int speciality) {
		if(speciality == 0) {
			return new ChemistryImportXMLParser();	
		}
		return new MicrobiologyImportXMLParser();
	}

}
