package app.exportdata.labdata;

import app.common.data.RequestData;
import app.exportdata.extension.json.ExportJSONExtension;
import app.exportdata.extension.xml.ExportXMLExtension;
import main.DocType;

public class ChemistryExportData<T> extends ExportData{
	
	private RequestData requestData;
	
	public RequestData RequestData() {
		return requestData;
	}

	public ChemistryExportData(RequestData requestData) {
		super(requestData.getSpeciality());
		addExtension(DocType.JSON, new ExportJSONExtension(this));
		addExtension(DocType.XML, new ExportXMLExtension(this));
		this.requestData = requestData;
	}

}
