package app.exportdata.parser;

import app.exportdata.parser.json.ExportJSONParser;

public interface JSONExportParserFactory {
	ExportJSONParser getJSONParser(int speciality);
}
