package app.labdata.handler.importdata;

import app.ReportData;
import app.RequestData;
import app.labdata.ChemistryExportData;
import app.labdata.LabData;

public class ImportChemistryLabDataHandler<T> implements ImportLabDataHandler{

	private ReportData<T> reportData;
	
	public ImportChemistryLabDataHandler(ReportData<T> reportData) {
		this.reportData = reportData;
	}

	@Override
	public LabData getData() {
		return new ChemistryExportData(reportData);
	}
}
