package app.importdata.parser;

import main.DocType;

public interface ImportTypeParserFactory {
	ImportParserFactory getTypeParserFactory(DocType type);
}
