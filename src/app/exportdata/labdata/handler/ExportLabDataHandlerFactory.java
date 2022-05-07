package app.exportdata.labdata.handler;

import app.common.data.RequestData;

public interface ExportLabDataHandlerFactory {
	ExportLabDataHandler getHandler(RequestData data);
}
