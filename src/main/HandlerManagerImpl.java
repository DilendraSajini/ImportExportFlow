package main;

import app.common.data.ReportData;
import app.common.data.RequestData;
import app.exportdata.labdata.handler.DataHandler;
import app.exportdata.labdata.handler.ExportDataHandler;
import app.exportdata.labdata.handler.HandlerManager;
import app.importdata.labdata.handler.ImportDataHandler;

public class HandlerManagerImpl implements HandlerManager {

	private static class InstanceHolder {
		private static final HandlerManagerImpl INSTANCE = new HandlerManagerImpl();
	}

	private HandlerManagerImpl() {

	}

	public static HandlerManagerImpl getInstance() {
		return InstanceHolder.INSTANCE;
	}

	public DataHandler getExportHandler(RequestData data) {
		return new ExportDataHandler(data);
	}

	@Override
	public <T> DataHandler getImportHandler(ReportData<T> data) {
		return new ImportDataHandler<>(data);
	}
}
