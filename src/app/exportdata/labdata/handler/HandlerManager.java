package app.exportdata.labdata.handler;

import app.common.data.ReportData;
import app.common.data.RequestData;

public interface HandlerManager {
	DataHandler getExportHandler(RequestData data);
	<T> DataHandler getImportHandler(ReportData<T> data);
}
