package app.exportdata.labdata;

import app.common.data.RequestData;
import app.common.labdata.LabData;
import app.extension.exportdata.json.ExportJSONExtension;
import app.extension.exportdata.xml.ExportXMLExtension;
import main.DocType;

public class ExportData extends LabData{
	
	private RequestData requestData;
	
	public RequestData getRequestData() {
		return requestData;
	}

	public ExportData(RequestData requestData) {
		super(requestData.getSpeciality());
		this.requestData = requestData;
		// Register required extensions
		addExtension(DocType.JSON, new ExportJSONExtension(this));
		addExtension(DocType.XML, new ExportXMLExtension(this));
	}

}
