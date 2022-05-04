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
		RequestData requestData = new RequestData(0);
		PersistanceAPI persistanceAPI = new PersistanceAPIImpl();
		new ExportInteractor(new ExportLabDataHandlerFactoryImpl(), persistanceAPI).export(requestData);
		
		String stringXML = "<xml></xml>";
		ReportData<String> data = new  ReportData<>(0, stringXML);
		new ImportInteractor<String>(new ImportLabDataHandlerFactoryImpl(), persistanceAPI).importData(data);
	}
}
