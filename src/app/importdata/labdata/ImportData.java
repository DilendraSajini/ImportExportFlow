package app.importdata.labdata;

import app.common.data.ReportData;
import app.common.labdata.LabData;
import app.extension.importdata.ImportExtensionProviderImpl;

public class ImportData<T> extends LabData {
	private ReportData<T> reportData;

	public ReportData<T> getReportData() {
		return reportData;
	}

	public ImportData(ReportData<T> reportData, ImportExtensionProviderImpl<T> extensionProvider) {
		super(reportData.getSpeciality());
		this.reportData = reportData;
		// Register required extensions
		setExtensionMap(extensionProvider.getExtensionMap(this));
	}
}
