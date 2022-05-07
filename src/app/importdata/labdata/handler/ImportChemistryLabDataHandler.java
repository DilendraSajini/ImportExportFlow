package app.importdata.labdata.handler;

import app.common.data.ReportData;
import app.common.labdata.LabData;
import app.importdata.labdata.ChemistryImportData;

public class ImportChemistryLabDataHandler<T> implements ImportLabDataHandler{

	private ReportData<T> reportData;
	
	public ImportChemistryLabDataHandler(ReportData<T> reportData) {
		this.reportData = reportData;
	}

	@Override
	public LabData getData() {
		return new ChemistryImportData(reportData);
	}
}
