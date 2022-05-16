package main;

import app.common.data.ReportData;
import app.common.data.RequestData;
import app.common.persistance.PersistanceAPI;
import app.exportdata.interactors.ExportInteractor;
import app.importdata.interactors.ImportInteractor;
import main.persistance.PersistanceAPIImpl;

public class Main {

	public static void main(String[] args) {
		RequestData requestData = new RequestData(2);
		PersistanceAPI persistanceAPI = new PersistanceAPIImpl();
		new ExportInteractor(persistanceAPI, HandlerManagerImpl.getInstance()).export(requestData, DocType.XML);

		String stringXML = "<xml></xml>";
		ReportData<String> data = new ReportData<>(2, stringXML);
		new ImportInteractor<String>(persistanceAPI, HandlerManagerImpl.getInstance()).importData(data, DocType.XML);
	}
}
