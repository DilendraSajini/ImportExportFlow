package main;

import app.PersistanceAPI;
import app.RequestData;
import app.interactors.ExportInteractor;
import main.labdata.handler.ExportLabDataHandlerFactoryImpl;
import main.persistance.PersistanceAPIImpl;

public class Main {

	public static void main(String[] args) {
		RequestData requestData = new RequestData();
		PersistanceAPI persistanceAPI = new PersistanceAPIImpl();
		new ExportInteractor(new ExportLabDataHandlerFactoryImpl(), persistanceAPI).export(requestData);
		
		//new ImportInteractor(new ImportLabDataHandlerFactoryImpl(), persistanceAPI).importData(File object);
	}
}
