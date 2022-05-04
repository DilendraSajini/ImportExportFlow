package app.importdata.labdata;

import app.data.ReportData;
import app.importdata.extension.json.ImportJSONExtension;
import app.importdata.extension.xml.ImportXMLExtension;
import main.DocType;

public class ChemistryImportData<T> extends ImportData {
	private ReportData<T> reportData;

	public ReportData<T> ReportData() {
		return reportData;
	}

	public ChemistryImportData(ReportData<T> reportData) {
		super(reportData.getSpeciality());
		addExtension(DocType.JSON, new ImportJSONExtension<T>(this));
		addExtension(DocType.XML, new ImportXMLExtension<T>(this));
		this.reportData = reportData;
	}
}
