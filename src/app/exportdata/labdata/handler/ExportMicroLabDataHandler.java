package app.exportdata.labdata.handler;

import app.common.labdata.LabData;
import app.data.RequestData;
import app.exportdata.labdata.MicrobiologyExportData;

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
