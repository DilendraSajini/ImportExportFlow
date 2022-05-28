package app.importdata.labdata;

import app.common.data.ReportData;
import app.common.extension.ImportExtensionProvider;
import app.common.labdata.LabData;

public class ImportData<T> extends LabData {
	private ReportData<T> reportData;

	public ReportData<T> getReportData() {
		return reportData;
	}

	public ImportData(ReportData<T> reportData, ImportExtensionProvider extensionProvider) {
		super(reportData.getSpeciality());
		this.reportData = reportData;
		// Register required extensions
		setExtensionMap(extensionProvider.getImportExtensionMap(this));
	}
}
