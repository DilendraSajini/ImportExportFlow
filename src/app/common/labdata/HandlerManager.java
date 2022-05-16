package app.common.labdata;

import app.common.data.ReportData;
import app.common.data.RequestData;
import app.common.labdata.handler.DataHandler;

public interface HandlerManager {
	DataHandler getExportHandler(RequestData data);
	<T> DataHandler getImportHandler(ReportData<T> data);
}
