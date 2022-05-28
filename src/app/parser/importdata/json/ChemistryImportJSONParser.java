package app.parser.importdata.json;

import app.common.data.ReportData;
import app.importdata.labdata.ImportData;
import app.parser.importdata.ImportParser;

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
