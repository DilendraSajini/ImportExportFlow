package main.exportdata.labdata.handler;

import app.common.data.RequestData;
import app.common.extension.ExtensionProvider;
import app.common.labdata.handler.DataHandler;
import app.exportdata.labdata.ExportData;
import app.extension.exportdata.ExportExtensionProviderImpl;

public class ExportDataHandler implements DataHandler {

	private RequestData requestData;

	private ExportExtensionProviderImpl extensionProvider;

	public ExportDataHandler(RequestData requestData, ExtensionProvider extensionProvider) {
		this.requestData = requestData;
		this.extensionProvider = (ExportExtensionProviderImpl)extensionProvider;
	}

	@Override
	public ExportData getData() {
		return new ExportData(requestData, extensionProvider);
	}
}
