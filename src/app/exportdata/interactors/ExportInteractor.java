package app.exportdata.interactors;

import app.common.data.RequestData;
import app.common.persistance.PersistanceAPI;
import app.exportdata.extension.ExportLabDataExtension;
import app.exportdata.labdata.handler.ExportDataHandler;
import main.DocType;

public class ExportInteractor {

	private PersistanceAPI persistanceApi;

	public ExportInteractor(PersistanceAPI persistanceAPI) {
		super();
		this.persistanceApi = persistanceAPI;
	}

	public void export(RequestData data, DocType type) {
		ExportDataHandler handler = new ExportDataHandler(data);
		String xmlString = ((ExportLabDataExtension) (handler.getData().getExtensionMap().get(type))).getString();
		persistanceApi.save(xmlString);
		System.out.println(xmlString);
	}

}
