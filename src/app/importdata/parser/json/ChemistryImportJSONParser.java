package app.importdata.parser.json;

import app.common.data.ReportData;
import app.importdata.labdata.ImportData;
import app.importdata.parser.ImportParser;

public class ChemistryImportJSONParser<T> extends ImportParser<T>{

	public ChemistryImportJSONParser(ImportData<T> importData) {
		super(importData);
	}

	@Override
	public Object getObject() {
		ReportData<T> reportData = importData.getReportData();
		return "Chemistry JSON Report Object"+ reportData.getImportData();
	}

}
