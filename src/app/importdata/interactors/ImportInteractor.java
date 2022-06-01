package app.importdata.interactors;

import java.util.function.BiFunction;
import app.common.data.ReportData;
import app.common.labdata.HandlerManager;
import app.common.labdata.handler.DataHandler;
import app.common.persistable.PersistableData;
import app.common.persistance.PersistanceAPI;
import app.extension.importdata.ImportLabDataExtension;
import main.DocType;

public class ImportInteractor<T> {

	private PersistanceAPI persistanceAPI;
	private HandlerManager handlerManager;

	public ImportInteractor(PersistanceAPI persistanceAPI, HandlerManager handlerManager) {
		super();
		this.persistanceAPI = persistanceAPI;
		this.handlerManager = handlerManager;
	}

	public void importData(ReportData<T> data, DocType type,
			BiFunction<String, T, PersistableData> persistableDataSupplier) {
		DataHandler handler = handlerManager.getImportHandler(data);
		PersistableData persistableData = ((ImportLabDataExtension<T>) (handler.getData()
				.getExtensionMap().get(type))).processData(persistableDataSupplier);
		persistanceAPI.save(persistableData.getFinalImportOutput());
		System.out.println(persistableData.getFinalImportOutput());
	}
}
