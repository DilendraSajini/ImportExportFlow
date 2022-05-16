package app.importdata.labdata;

import app.common.data.ReportData;
import app.common.labdata.LabData;
import app.importdata.extension.json.ImportJSONExtension;
import app.importdata.extension.xml.ImportXMLExtension;
import main.DocType;

public class ImportData<T> extends LabData {
	private ReportData<T> reportData;

	public ReportData<T> getReportData() {
		return reportData;
	}

	public ImportData(ReportData<T> reportData) {
		super(reportData.getSpeciality());
		this.reportData = reportData;
		addExtension(DocType.JSON, new ImportJSONExtension<>(this));
		addExtension(DocType.XML, new ImportXMLExtension<>(this));
	}
}
