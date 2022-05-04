package app.exportdata.parser.xml;

import app.exportdata.parser.XMLExportParserFactory;

public class XMLExportParserFactoryImpl implements XMLExportParserFactory{

	@Override
	public ExportXMLParser getXMLParser(int speciality) {
		if(speciality == 0) {
			return new ChemistryExportXMLParser();	
		}
		return new MicrobiologyExportXMLParser();
	}
}
