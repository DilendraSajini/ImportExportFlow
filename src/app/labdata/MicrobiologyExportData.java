package app.labdata;

import app.RequestData;
import main.DocType;
import main.extension.ExportDataExtensionFactoryImpl;

public class MicrobiologyExportData extends ExportData{
private RequestData requestData;
	
	public RequestData getRequestData() {
		return requestData;
	}

	public MicrobiologyExportData(RequestData requestData) {
		super(requestData.getSpeciality());
		addExtension(DocType.JSON, new ExportDataExtensionFactoryImpl().getExportDataExtension(DocType.JSON, this));
		addExtension(DocType.XML, new ExportDataExtensionFactoryImpl().getExportDataExtension(DocType.XML, this));
		this.requestData = requestData;
	}
}
