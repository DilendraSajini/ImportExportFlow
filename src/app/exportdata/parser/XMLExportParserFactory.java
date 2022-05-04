package app.exportdata.parser;

import app.exportdata.parser.xml.ExportXMLParser;

public interface XMLExportParserFactory {
	ExportXMLParser getXMLParser(int speciality);
}
