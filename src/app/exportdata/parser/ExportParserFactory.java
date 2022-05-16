package app.exportdata.parser;

import app.common.labdata.LabData;

public interface ExportParserFactory {
	ExportParser getParser(int speciality, LabData exportData);
}
