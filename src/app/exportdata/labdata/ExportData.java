package app.exportdata.labdata;

import app.common.data.RequestData;
import app.common.labdata.LabData;
import app.exportdata.extension.json.ExportJSONExtension;
import app.exportdata.extension.xml.ExportXMLExtension;
import main.DocType;

public class ExportData extends LabData{
	
	private RequestData requestData;
	
	public RequestData getRequestData() {
		return requestData;
	}

	public ExportData(RequestData requestData) {
		super(requestData.getSpeciality());
		this.requestData = requestData;
		addExtension(DocType.JSON, new ExportJSONExtension(this));
		addExtension(DocType.XML, new ExportXMLExtension(this));
	}

}
