package main.importdata.labdata.handler;

import app.common.data.ReportData;
import app.common.extension.ImportExtensionProvider;
import app.common.labdata.handler.DataHandler;
import app.importdata.labdata.ImportData;

public class ImportDataHandler<T> implements DataHandler {

	private ReportData<T> reportData;

	private ImportExtensionProvider extensionProvider;

	public ImportDataHandler(ReportData<T> reportData, ImportExtensionProvider extensionProvider) {
		this.reportData = reportData;
		this.extensionProvider = extensionProvider;
	}

	@Override
	public ImportData<T> getData() {
		return new ImportData<>(reportData, extensionProvider);
	}
}
