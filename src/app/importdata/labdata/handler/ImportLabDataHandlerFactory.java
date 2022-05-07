package app.importdata.labdata.handler;

import app.common.data.ReportData;

public interface ImportLabDataHandlerFactory<T> {
	ImportLabDataHandler getHandler(ReportData<T> data);
}
