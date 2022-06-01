package main;

import java.util.function.BiFunction;

import app.common.data.ReportData;
import app.common.data.RequestData;
import app.common.persistable.PersistableData;
import app.common.persistance.PersistanceAPI;
import app.exportdata.interactors.ExportInteractor;
import app.importdata.interactors.ImportInteractor;
import main.common.labdata.HandlerManagerImpl;
import main.persistance.PersistanceAPIImpl;

public class Main {

	public static void main(String[] args) {
		// To Do: handle batch data
		RequestData requestData = new RequestData(2);
		PersistanceAPI persistanceAPI = new PersistanceAPIImpl();
		new ExportInteractor(persistanceAPI, HandlerManagerImpl.getInstance()).export(requestData, DocType.XML);

		String stringXML = "<xml></xml>";
		ReportData<String> data = new ReportData<>(2, stringXML);
		BiFunction<String, String, PersistableData> persistableDataSupplierString = PersistableData::new;
		new ImportInteractor<String>(persistanceAPI, HandlerManagerImpl.getInstance()).importData(data, DocType.XML,
				persistableDataSupplierString);

		XMLHolder xmlObject = new XMLHolder("<xml></xml>");
		ReportData<XMLHolder> xmlData = new ReportData<>(2, xmlObject);
		BiFunction<String, XMLHolder, PersistableData> persistableDataSupplierXMLHolder = PersistableData::new;
		new ImportInteractor<XMLHolder>(persistanceAPI, HandlerManagerImpl.getInstance()).importData(xmlData,
				DocType.XML, persistableDataSupplierXMLHolder);
	}
}
