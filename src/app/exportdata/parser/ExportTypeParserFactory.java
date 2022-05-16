package app.exportdata.parser;

import main.DocType;

public interface ExportTypeParserFactory {
	ExportParserFactory getTypeParserFactory(DocType type);
}
