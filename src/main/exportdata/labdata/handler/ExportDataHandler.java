package main.exportdata.labdata.handler;

import app.common.data.RequestData;
import app.exportdata.labdata.ExportData;
import app.exportdata.labdata.handler.DataHandler;

public class ExportDataHandler implements DataHandler{

	private RequestData requestData;
	
	public ExportDataHandler(RequestData requestData) {
		this.requestData = requestData;
	}

	@Override
	public ExportData getData() {
		return new ExportData(requestData);
	}
}
