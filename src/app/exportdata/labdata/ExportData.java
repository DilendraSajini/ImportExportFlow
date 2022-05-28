package app.exportdata.labdata;

import app.common.data.RequestData;
import app.common.extension.ExportExtensionProvider;
import app.common.labdata.LabData;

public class ExportData extends LabData {

	private RequestData requestData;

	public RequestData getRequestData() {
		return requestData;
	}

	public ExportData(RequestData requestData, ExportExtensionProvider extensionProvider) {
		super(requestData.getSpeciality());
		this.requestData = requestData;
		setExtensionMap(extensionProvider.getExportExtensionMap(this));
	}

}
