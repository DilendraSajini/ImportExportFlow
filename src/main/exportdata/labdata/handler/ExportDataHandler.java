package main.exportdata.labdata.handler;

import app.common.data.RequestData;
import app.common.labdata.handler.DataHandler;
import app.exportdata.labdata.ExportData;
import app.extension.exportdata.ExportExtensionProvider;

public class ExportDataHandler implements DataHandler {

	private RequestData requestData;

	public ExportDataHandler(RequestData requestData) {
		this.requestData = requestData;
	}

	@Override
	public ExportData getData() {
		return new ExportData(requestData, new ExportExtensionProvider());
	}
}
