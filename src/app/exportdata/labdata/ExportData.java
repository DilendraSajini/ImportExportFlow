package app.exportdata.labdata;

import app.common.data.RequestData;
import app.common.labdata.LabData;
import app.extension.exportdata.ExportExtensionProviderImpl;

public class ExportData extends LabData {

	private RequestData requestData;

	public RequestData getRequestData() {
		return requestData;
	}

	public ExportData(RequestData requestData, ExportExtensionProviderImpl extensionProvider) {
		super(requestData.getSpeciality());
		this.requestData = requestData;
		setExtensionMap(extensionProvider.getExtensionMap(this));
	}

}
