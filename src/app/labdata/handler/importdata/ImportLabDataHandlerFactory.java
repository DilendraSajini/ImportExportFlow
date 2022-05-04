package app.labdata.handler.importdata;

import app.ReportData;

public interface ImportLabDataHandlerFactory<T> {
	ImportLabDataHandler getHandler(ReportData<T> data);
}
