package app.interactors;

import app.PersistanceAPI;
import app.ReportData;
import app.labdata.handler.importdata.ImportLabDataHandler;
import app.labdata.handler.importdata.ImportLabDataHandlerFactory;

public class ImportInteractor<T> {

	private ImportLabDataHandlerFactory<T> dataHandlerFactory;
	private PersistanceAPI persistanceAPI;
	
	public void importData(ReportData<T> data) {
		ImportLabDataHandler handler = dataHandlerFactory.getHandler(data);	
	}
}
