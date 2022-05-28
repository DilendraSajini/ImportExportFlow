package app.extension.importdata;

import java.util.EnumMap;

import app.common.extension.ImportExtensionProvider;
import app.common.extension.LabDataExtension;
import app.common.labdata.LabData;
import app.extension.importdata.json.ImportJSONExtension;
import app.extension.importdata.xml.ImportXMLExtension;
import app.importdata.labdata.ImportData;
import main.DocType;

public class ImportExtensionProviderImpl<T> implements ImportExtensionProvider {

	@Override
	public EnumMap<DocType, LabDataExtension> getImportExtensionMap(LabData data) {
		EnumMap<DocType, LabDataExtension> extensionMap = new EnumMap<>(DocType.class);
		extensionMap.put(DocType.JSON, new ImportJSONExtension<>((ImportData<T>) data));
		extensionMap.put(DocType.XML, new ImportXMLExtension<>((ImportData<T>) data));
		return extensionMap;
	}
}
