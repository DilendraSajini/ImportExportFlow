package main;

import app.common.data.ReportData;
import app.common.data.RequestData;
import app.common.persistance.PersistanceAPI;
import app.exportdata.interactors.ExportInteractor;
import app.importdata.interactors.ImportInteractor;
import main.persistance.PersistanceAPIImpl;

public class Main {

	public static void main(String[] args) {
		RequestData requestData = new RequestData(1);
		PersistanceAPI persistanceAPI = new PersistanceAPIImpl();
		new ExportInteractor(persistanceAPI).export(requestData, DocType.JSON);

		String stringXML = "<xml></xml>";
		ReportData<String> data = new ReportData<>(1, stringXML);
		new ImportInteractor<String>(persistanceAPI).importData(data, DocType.JSON);
	}
}
