package app.exportdata.interactors;

import app.common.data.RequestData;
import app.common.persistance.PersistanceAPI;
import app.exportdata.extension.ExportLabDataExtension;
import app.exportdata.labdata.handler.ExportDataHandler;
import app.exportdata.labdata.handler.HandlerManager;
import main.DocType;

public class ExportInteractor {

	private PersistanceAPI persistanceApi;
	private HandlerManager handlerManager;

	public ExportInteractor(PersistanceAPI persistanceAPI, HandlerManager handlerManager) {
		super();
		this.persistanceApi = persistanceAPI;
		this.handlerManager = handlerManager;
	}

	public void export(RequestData data, DocType type) {
		ExportDataHandler handler = (ExportDataHandler) handlerManager.getExportHandler(data);
		String xmlString = ((ExportLabDataExtension) (handler.getData().getExtensionMap().get(type))).getString();
		persistanceApi.save(xmlString);
		System.out.println(xmlString);
	}

}
