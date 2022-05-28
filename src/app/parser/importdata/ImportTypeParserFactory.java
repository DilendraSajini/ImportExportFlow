package app.parser.importdata;

import main.DocType;

public interface ImportTypeParserFactory<T> {
	ImportParserFactory<T> getTypeParserFactory(DocType type);
}
