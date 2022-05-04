package app.exportdata.interactors;

import app.common.persistance.PersistanceAPI;
import app.data.RequestData;
import app.exportdata.extension.ExportLabDataExtension;
import app.exportdata.labdata.handler.ExportLabDataHandler;
import app.exportdata.labdata.handler.ExportLabDataHandlerFactory;
import main.DocType;

public class ExportInteractor {

	private ExportLabDataHandlerFactory dataHandlerFactory;
	private PersistanceAPI persistanceAPI;

	public ExportInteractor(ExportLabDataHandlerFactory dataHandlerFactory, PersistanceAPI persistanceAPI) {
		super();
		this.dataHandlerFactory = dataHandlerFactory;
		this.persistanceAPI = persistanceAPI;
	}

	public void export(RequestData data, DocType type) {
		ExportLabDataHandler handler = dataHandlerFactory.getHandler(data);
		String xmlString = ((ExportLabDataExtension)(handler.getData().getExtensionMap().get(type))).getString();
		persistanceAPI.save(xmlString);
		System.out.println(xmlString);
	}

}
