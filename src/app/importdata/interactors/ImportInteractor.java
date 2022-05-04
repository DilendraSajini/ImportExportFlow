package app.importdata.interactors;

import app.common.persistance.PersistanceAPI;
import app.data.ReportData;
import app.importdata.extension.ImportLabDataExtension;
import app.importdata.labdata.handler.ImportLabDataHandler;
import app.importdata.labdata.handler.ImportLabDataHandlerFactory;
import main.DocType;

public class ImportInteractor<T> {

	private ImportLabDataHandlerFactory<T> dataHandlerFactory;
	private PersistanceAPI persistanceAPI;

	public ImportInteractor(ImportLabDataHandlerFactory<T> importLabDataHandlerFactory, PersistanceAPI persistanceAPI) {
		super();
		this.dataHandlerFactory = importLabDataHandlerFactory;
		this.persistanceAPI = persistanceAPI;
	}

	public void importData(ReportData<T> data, DocType type) {
		ImportLabDataHandler handler = dataHandlerFactory.getHandler(data);
		Object object = ((ImportLabDataExtension) (handler.getData().getExtensionMap().get(type))).getObject();
		persistanceAPI.save(object);
		System.out.println(object);
	}
}
