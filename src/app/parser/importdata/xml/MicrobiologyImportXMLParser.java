package app.parser.importdata.xml;

import app.common.data.ReportData;
import app.importdata.labdata.ImportData;
import app.importdata.persistable.PersistableData;
import app.parser.importdata.ImportParser;

public class MicrobiologyImportXMLParser<T> extends ImportParser<T> {

	public MicrobiologyImportXMLParser(ImportData<T> importData) {
		super(importData);
	}

	@Override
	public PersistableData<T> getObject() {
		ReportData<T> reportData = importData.getReportData();
		return new PersistableData<>("Microbiology XML Report Object", reportData.getImportData());
	}
}
