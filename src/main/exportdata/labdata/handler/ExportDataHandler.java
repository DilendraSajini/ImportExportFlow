package main.exportdata.labdata.handler;

import app.common.data.RequestData;
import app.common.extension.ExportExtensionProvider;
import app.common.labdata.handler.DataHandler;
import app.exportdata.labdata.ExportData;

public class ExportDataHandler implements DataHandler {

	private RequestData requestData;

	private ExportExtensionProvider extensionProvider;

	public ExportDataHandler(RequestData requestData, ExportExtensionProvider extensionProvider) {
		this.requestData = requestData;
		this.extensionProvider = extensionProvider;
	}

	@Override
	public ExportData getData() {
		return new ExportData(requestData, extensionProvider);
	}
}
