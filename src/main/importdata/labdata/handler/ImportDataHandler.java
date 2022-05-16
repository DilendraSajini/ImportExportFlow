package main.importdata.labdata.handler;

import app.common.data.ReportData;
import app.common.labdata.handler.DataHandler;
import app.importdata.labdata.ImportData;

public class ImportDataHandler<T> implements DataHandler{

	private ReportData<T> reportData;
	
	public ImportDataHandler(ReportData<T> reportData) {
		this.reportData = reportData;
	}

	@Override
	public ImportData<T> getData() {
		return new ImportData<>(reportData);
	}
}
