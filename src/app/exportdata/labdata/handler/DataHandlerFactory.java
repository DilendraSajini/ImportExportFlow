package app.exportdata.labdata.handler;

import app.common.data.RequestData;

public interface DataHandlerFactory {
	DataHandler getHandler(RequestData data);
}
