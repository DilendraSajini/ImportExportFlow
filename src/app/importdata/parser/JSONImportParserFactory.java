package app.importdata.parser;

import app.importdata.parser.json.ImportJSONParser;

public interface JSONImportParserFactory {

	ImportJSONParser getJSONParser(int speciality);

}
