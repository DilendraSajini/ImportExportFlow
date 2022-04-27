package app.labdata;

import app.RequestData;
import main.DocType;
import main.extension.ExportDataExtensionFactoryImpl;

public class ChemistryExportData<T> extends ExportData{
	
	private RequestData requestData;
	
	public RequestData RequestData() {
		return requestData;
	}

	public ChemistryExportData(RequestData requestData) {
		super(requestData.getSpeciality());
		addExtension(DocType.JSON, new ExportDataExtensionFactoryImpl().getExportDataExtension(DocType.JSON, this));
		addExtension(DocType.XML, new ExportDataExtensionFactoryImpl().getExportDataExtension(DocType.XML, this));
		this.requestData = requestData;
	}

}
