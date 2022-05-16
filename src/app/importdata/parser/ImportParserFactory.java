package app.importdata.parser;

import app.common.labdata.LabData;

public interface ImportParserFactory {
	ImportParser getParser(int speciality, LabData importData);
}
