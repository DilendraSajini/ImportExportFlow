package app.importdata.labdata.handler;

import app.common.labdata.LabData;
import app.data.ReportData;
import app.importdata.labdata.MicrobiologyImportData;

public class ImportMicrobiologyLabDataHandler<T> implements ImportLabDataHandler {

private ReportData<T> reportData;
	
	public ImportMicrobiologyLabDataHandler(ReportData<T> reportData) {
		this.reportData = reportData;
	}
	
	@Override
	public LabData getData() {
		return new MicrobiologyImportData(reportData);
	}

}
