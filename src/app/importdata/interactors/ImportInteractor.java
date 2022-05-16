package app.importdata.interactors;

import app.common.data.ReportData;
import app.common.persistance.PersistanceAPI;
import app.importdata.extension.ImportLabDataExtension;
import app.importdata.labdata.handler.ImportDataHandler;
import main.DocType;

public class ImportInteractor<T> {

	private PersistanceAPI persistanceAPI;

	public ImportInteractor(PersistanceAPI persistanceAPI) {
		super();
		this.persistanceAPI = persistanceAPI;
	}

	public void importData(ReportData<T> data, DocType type) {
		ImportDataHandler<T> handler = new ImportDataHandler<>(data);
		Object object = ((ImportLabDataExtension) (handler.getData().getExtensionMap().get(type))).getObject();
		persistanceAPI.save(object);
		System.out.println(object);
	}
}
