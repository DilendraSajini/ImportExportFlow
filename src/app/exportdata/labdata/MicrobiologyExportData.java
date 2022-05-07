package app.exportdata.labdata;

import app.common.data.RequestData;
import app.exportdata.extension.json.ExportJSONExtension;
import app.exportdata.extension.xml.ExportXMLExtension;
import main.DocType;

public class MicrobiologyExportData extends ExportData{
private RequestData requestData;
	
	public RequestData getRequestData() {
		return requestData;
	}

	public MicrobiologyExportData(RequestData requestData) {
		super(requestData.getSpeciality());
		addExtension(DocType.JSON, new ExportJSONExtension(this));
		addExtension(DocType.XML, new ExportXMLExtension(this));
		this.requestData = requestData;
	}
}
