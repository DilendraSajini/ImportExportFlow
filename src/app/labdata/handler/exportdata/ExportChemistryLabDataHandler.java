package app.labdata.handler.exportdata;

import app.RequestData;
import app.labdata.ChemistryExportData;
import app.labdata.LabData;

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
