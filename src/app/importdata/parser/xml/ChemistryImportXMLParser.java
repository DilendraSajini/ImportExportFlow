package app.importdata.parser.xml;

import app.common.data.ReportData;
import app.common.labdata.LabData;
import app.importdata.labdata.ImportData;
import app.importdata.parser.ImportParser;

public class ChemistryImportXMLParser extends ImportParser{

	public ChemistryImportXMLParser(LabData importData) {
		super(importData);
	}

	@Override
	public Object getObject() {
		ReportData<String> reportData = ((ImportData<String>)importData).getReportData();
		return "Chemistry XML Report Object"+ reportData;
	}

}
