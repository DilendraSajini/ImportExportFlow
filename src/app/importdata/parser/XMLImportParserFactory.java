package app.importdata.parser;

import app.importdata.parser.xml.ImportXMLParser;

public interface XMLImportParserFactory {

	ImportXMLParser getXMLParser(int speciality);

}
