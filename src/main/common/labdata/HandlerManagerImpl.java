package main.common.labdata;

import app.common.data.ReportData;
import app.common.data.RequestData;
import app.common.labdata.HandlerManager;
import main.exportdata.labdata.handler.ExportDataHandler;
import main.importdata.labdata.handler.ImportDataHandler;

public class HandlerManagerImpl implements HandlerManager {

	private static class InstanceHolder {
		private static final HandlerManagerImpl INSTANCE = new HandlerManagerImpl();
	}

	private HandlerManagerImpl() {

	}

	public static HandlerManagerImpl getInstance() {
		return InstanceHolder.INSTANCE;
	}

	public ExportDataHandler getExportHandler(RequestData data) {
		return new ExportDataHandler(data);
	}

	@Override
	public <T> ImportDataHandler<T> getImportHandler(ReportData<T> data) {
		return new ImportDataHandler<>(data);
	}
}
