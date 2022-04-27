package app.interactors;

import app.PersistanceAPI;
import app.RequestData;
import app.labdata.handler.exportdata.ExportLabDataHandler;
import app.labdata.handler.exportdata.ExportLabDataHandlerFactory;
import main.DocType;

public class ExportInteractor {

	private ExportLabDataHandlerFactory dataHandlerFactory;
	private PersistanceAPI persistanceAPI;

	public ExportInteractor(ExportLabDataHandlerFactory dataHandlerFactory, PersistanceAPI persistanceAPI) {
		super();
		this.dataHandlerFactory = dataHandlerFactory;
		this.persistanceAPI = persistanceAPI;
	}

	public void export(RequestData data) {
		ExportLabDataHandler handler = dataHandlerFactory.getHandler(data);
		String xmlString = handler.getData().getExtensionMap().get(DocType.XML).getString();
		persistanceAPI.save(xmlString);
		System.out.println("Export Data Successfully.......................");
	}

}
