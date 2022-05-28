package app.extension.exportdata;

import java.util.EnumMap;

import app.common.extension.ExportExtensionProvider;
import app.common.extension.LabDataExtension;
import app.common.labdata.LabData;
import app.exportdata.labdata.ExportData;
import app.extension.exportdata.json.ExportJSONExtension;
import app.extension.exportdata.xml.ExportXMLExtension;
import main.DocType;

public class ExportExtensionProviderImpl implements ExportExtensionProvider {

	@Override
	public EnumMap<DocType, LabDataExtension> getExportExtensionMap(LabData data) {
		EnumMap<DocType, LabDataExtension> extensionMap = new EnumMap<>(DocType.class);
		extensionMap.put(DocType.JSON, new ExportJSONExtension((ExportData) data));
		extensionMap.put(DocType.XML, new ExportXMLExtension((ExportData) data));
		return extensionMap;
	}

}