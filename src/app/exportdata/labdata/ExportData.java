package app.exportdata.labdata;

import app.common.data.RequestData;
import app.common.labdata.LabData;
import app.extension.exportdata.ExportExtensionProvider;

public class ExportData extends LabData {

	private RequestData requestData;

	public RequestData getRequestData() {
		return requestData;
	}

	public ExportData(RequestData requestData, ExportExtensionProvider extensionProvider) {
		super(requestData.getSpeciality());
		this.requestData = requestData;
		extensionMap = extensionProvider.getExtensionMap(this);
	}

}
