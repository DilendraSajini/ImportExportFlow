package main.importdata.labdata.handler;

import app.common.data.ReportData;
import app.common.extension.ExtensionProvider;
import app.common.labdata.handler.DataHandler;
import app.extension.importdata.ImportExtensionProviderImpl;
import app.importdata.labdata.ImportData;

public class ImportDataHandler<T> implements DataHandler {

	private ReportData<T> reportData;

	private ImportExtensionProviderImpl<T> extensionProvider;

	public ImportDataHandler(ReportData<T> reportData, ExtensionProvider extensionProvider) {
		this.reportData = reportData;
		this.extensionProvider = (ImportExtensionProviderImpl<T>) extensionProvider;
	}

	@Override
	public ImportData<T> getData() {
		return new ImportData<>(reportData, extensionProvider);
	}
}
