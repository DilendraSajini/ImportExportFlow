package main.parser;

import app.parser.xml.ChemistryExportXMLParser;
import app.parser.xml.MicrobiologyExportXMLParser;
import app.parser.xml.XMLParser;
import app.parser.xml.XMLParserFactory;

public class XMLParserFactoryImpl implements XMLParserFactory{

	@Override
	public XMLParser getXMLParser(int speciality) {
		if(speciality == 1) {
			return new ChemistryExportXMLParser();	
		}
		return new MicrobiologyExportXMLParser();
	}
}
