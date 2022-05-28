package app.parser.exportdata;

import main.DocType;

public interface ExportTypeParserFactory {
	ExportParserFactory getTypeParserFactory(DocType type);
}
