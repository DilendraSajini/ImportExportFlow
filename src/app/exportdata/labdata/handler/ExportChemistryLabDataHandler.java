package app.exportdata.labdata.handler;

import app.common.labdata.LabData;
import app.data.RequestData;
import app.exportdata.labdata.ChemistryExportData;

public class ExportChemistryLabDataHandler implements ExportLabDataHandler {

	private RequestData requestData;
	
	public ExportChemistryLabDataHandler(RequestData requestData) {
		this.requestData = requestData;
	}

	@Override
	public LabData getData() {
		return new ChemistryExportData(requestData);
	}

}
