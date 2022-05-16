package app.exportdata.labdata.handler;

import app.common.data.RequestData;
import app.common.labdata.LabData;
import app.exportdata.labdata.ExportData;

public class ExportDataHandler implements DataHandler{

	private RequestData requestData;
	
	public ExportDataHandler(RequestData requestData) {
		this.requestData = requestData;
	}

	@Override
	public LabData getData() {
		return new ExportData(requestData);
	}
}
