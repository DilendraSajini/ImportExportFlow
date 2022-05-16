package app.importdata.interactors;

import app.common.data.ReportData;
import app.common.persistance.PersistanceAPI;
import app.exportdata.labdata.handler.DataHandler;
import app.exportdata.labdata.handler.HandlerManager;
import app.importdata.extension.ImportLabDataExtension;
import main.DocType;

public class ImportInteractor<T> {

	private PersistanceAPI persistanceAPI;
	private HandlerManager handlerManager;

	public ImportInteractor(PersistanceAPI persistanceAPI, HandlerManager handlerManager) {
		super();
		this.persistanceAPI = persistanceAPI;
		this.handlerManager = handlerManager;
	}

	public void importData(ReportData<T> data, DocType type) {
		DataHandler handler = handlerManager.getImportHandler(data);
		Object object = ((ImportLabDataExtension) (handler.getData().getExtensionMap().get(type))).getObject();
		persistanceAPI.save(object);
		System.out.println(object);
	}
}
