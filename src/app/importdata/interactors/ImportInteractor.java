package app.importdata.interactors;

import app.common.data.ReportData;
import app.common.labdata.HandlerManager;
import app.common.labdata.handler.DataHandler;
import app.common.persistance.PersistanceAPI;
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
