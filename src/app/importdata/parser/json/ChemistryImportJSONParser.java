package app.importdata.parser.json;

import app.common.data.ReportData;
import app.common.labdata.LabData;
import app.importdata.labdata.ImportData;
import app.importdata.parser.ImportParser;

public class ChemistryImportJSONParser extends ImportParser{

	public ChemistryImportJSONParser(LabData importData) {
		super(importData);
	}

	@Override
	public Object getObject() {
		ReportData<String> reportData = ((ImportData<String>)importData).getReportData();
		return "Chemistry JSON Report Object"+ reportData.getImportData();
	}

}
