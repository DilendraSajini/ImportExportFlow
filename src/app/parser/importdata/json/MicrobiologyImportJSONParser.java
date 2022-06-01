package app.parser.importdata.json;

import app.common.data.ReportData;
import app.importdata.labdata.ImportData;
import app.importdata.persistable.PersistableData;
import app.parser.importdata.ImportParser;

public class MicrobiologyImportJSONParser<T> extends ImportParser<T> {

	public MicrobiologyImportJSONParser(ImportData<T> importData) {
		super(importData);
	}

	@Override
	public PersistableData<T> getObject() {
		ReportData<T> reportData = importData.getReportData();
		return new PersistableData<>("Microbiology JSON Report Object", reportData.getImportData());
	}
}
