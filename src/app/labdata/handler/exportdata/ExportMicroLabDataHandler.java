package app.labdata.handler.exportdata;

import app.RequestData;
import app.labdata.LabData;
import app.labdata.MicrobiologyExportData;

public class ExportMicroLabDataHandler implements ExportLabDataHandler{

	private RequestData requestData;
	
	public ExportMicroLabDataHandler(RequestData requestData) {
		this.requestData = requestData;
	}

	@Override
	public LabData getData() {
		return new MicrobiologyExportData(requestData);
	}
}
