package app.parser.importdata.xml;

import app.common.data.ReportData;
import app.importdata.labdata.ImportData;
import app.importdata.persistable.PersistableData;
import app.parser.importdata.ImportParser;

public class ChemistryImportXMLParser<T> extends ImportParser<T> {

	public ChemistryImportXMLParser(ImportData<T> importData) {
		super(importData);
	}

	// contains parsing logic according to different speciality. usage of xsd
	// generated files.
	@Override
	public PersistableData<T> getObject() {
		ReportData<T> reportData = importData.getReportData();
		return new PersistableData<>("Chemistry XML Report Object", reportData.getImportData());
	}

}
