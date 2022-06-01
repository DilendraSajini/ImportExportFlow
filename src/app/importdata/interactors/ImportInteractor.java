package app.importdata.interactors;

import app.common.data.ReportData;
import app.common.labdata.HandlerManager;
import app.common.labdata.handler.DataHandler;
import app.common.persistance.PersistanceAPI;
import app.extension.importdata.ImportLabDataExtension;
import app.importdata.persistable.PersistableData;
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
		PersistableData<T> persistableData = ((ImportLabDataExtension) (handler.getData().getExtensionMap().get(type))).getPersistableData();
		persistanceAPI.save(persistableData.getFinalImportOutput());
		System.out.println(persistableData.getFinalImportOutput());
	}
}
