package app.labdata.handler.exportdata;

import app.RequestData;

public interface ExportLabDataHandlerFactory {
	ExportLabDataHandler getHandler(RequestData data);
}
