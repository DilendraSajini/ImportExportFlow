package app.importdata.parser.xml;

import app.common.data.ReportData;
import app.importdata.labdata.ImportData;
import app.importdata.parser.ImportParser;

public class ChemistryImportXMLParser<T> extends ImportParser<T>{

	public ChemistryImportXMLParser(ImportData<T> importData) {
		super(importData);
	}

	@Override
	public Object getObject() {
		ReportData<T> reportData = importData.getReportData();
		return "Chemistry XML Report Object"+ reportData.getImportData();
	}

}
