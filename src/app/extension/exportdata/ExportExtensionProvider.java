package app.extension.exportdata;

import java.util.Map;

import app.common.extension.ExtensionProvider;
import app.common.extension.LabDataExtension;
import app.common.labdata.LabData;
import app.exportdata.labdata.ExportData;
import app.extension.exportdata.json.ExportJSONExtension;
import app.extension.exportdata.xml.ExportXMLExtension;
import main.DocType;

public class ExportExtensionProvider extends ExtensionProvider {

	public ExportExtensionProvider() {
		super();
	}

	@Override
	public Map<DocType, LabDataExtension> getExtensionMap(LabData data) {
		extensionMap.put(DocType.JSON, new ExportJSONExtension((ExportData) data));
		extensionMap.put(DocType.XML, new ExportXMLExtension((ExportData) data));
		return extensionMap;
	}
}
