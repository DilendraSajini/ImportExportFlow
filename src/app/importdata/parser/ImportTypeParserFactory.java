package app.importdata.parser;

import main.DocType;

public interface ImportTypeParserFactory<T> {
	ImportParserFactory<T> getTypeParserFactory(DocType type);
}
