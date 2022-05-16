package app.importdata.labdata.handler;

import app.common.data.ReportData;
import app.common.labdata.LabData;
import app.exportdata.labdata.handler.DataHandler;
import app.importdata.labdata.ImportData;

public class ImportDataHandler<T> implements DataHandler{

	private ReportData<T> reportData;
	
	public ImportDataHandler(ReportData<T> reportData) {
		this.reportData = reportData;
	}

	@Override
	public LabData getData() {
		return new ImportData<T>(reportData);
	}
}
