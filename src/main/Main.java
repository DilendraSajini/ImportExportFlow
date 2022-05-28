package main;

import app.common.data.ReportData;
import app.common.data.RequestData;
import app.common.persistance.PersistanceAPI;
import app.exportdata.interactors.ExportInteractor;
import app.importdata.interactors.ImportInteractor;
import main.common.labdata.HandlerManagerImpl;
import main.persistance.PersistanceAPIImpl;

public class Main {

	public static void main(String[] args) {
		// To Do: handle batch data
		RequestData requestData = new RequestData(1);
		PersistanceAPI persistanceAPI = new PersistanceAPIImpl();
		new ExportInteractor(persistanceAPI, HandlerManagerImpl.getInstance()).export(requestData, DocType.JSON);

		String stringXML = "<xml></xml>";
		ReportData<String> data = new ReportData<>(1, stringXML);
		new ImportInteractor<String>(persistanceAPI, HandlerManagerImpl.getInstance()).importData(data, DocType.JSON);
	}
}
