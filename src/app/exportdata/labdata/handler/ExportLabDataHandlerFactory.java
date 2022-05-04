package app.exportdata.labdata.handler;

import app.data.RequestData;

public interface ExportLabDataHandlerFactory {
	ExportLabDataHandler getHandler(RequestData data);
}
