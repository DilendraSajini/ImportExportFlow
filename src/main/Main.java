package main;

import app.common.persistance.PersistanceAPI;
import app.data.ReportData;
import app.data.RequestData;
import app.exportdata.interactors.ExportInteractor;
import app.importdata.interactors.ImportInteractor;
import main.exportdata.labdata.handler.ExportLabDataHandlerFactoryImpl;
import main.importdata.labdata.handler.ImportLabDataHandlerFactoryImpl;
import main.persistance.PersistanceAPIImpl;

public class Main {

	public static void main(String[] args) {
		RequestData requestData = new RequestData(9);
		PersistanceAPI persistanceAPI = new PersistanceAPIImpl();
		new ExportInteractor(new ExportLabDataHandlerFactoryImpl(), persistanceAPI).export(requestData, DocType.JSON);

		String stringXML = "<xml></xml>";
		ReportData<String> data = new ReportData<>(9, stringXML);
		new ImportInteractor<String>(new ImportLabDataHandlerFactoryImpl(), persistanceAPI).importData(data, DocType.JSON);
	}
}
