package app.importdata.parser;

import app.importdata.labdata.ImportData;

public interface ImportParserFactory<T> {
	ImportParser<T> getParser(int speciality, ImportData<T> importData);
}
