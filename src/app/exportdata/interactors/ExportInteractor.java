package app.exportdata.interactors;

import java.util.function.Function;

import app.common.data.RequestData;
import app.common.labdata.HandlerManager;
import app.common.labdata.handler.DataHandler;
import app.common.persistable.PersistableData;
import app.common.persistance.PersistanceAPI;
import app.extension.exportdata.ExportLabDataExtension;
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
		DataHandler handler = handlerManager.getExportHandler(data);
		Function<String, PersistableData> persistableDataSupplier = PersistableData::new;
		PersistableData persistableData = ((ExportLabDataExtension) (handler.getData().getExtensionMap().get(type)))
				.processData(persistableDataSupplier);
		persistanceApi.save(persistableData.getFinalImportOutput());
		System.out.println(persistableData.getFinalImportOutput());
	}

}
