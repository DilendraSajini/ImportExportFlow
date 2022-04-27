package app.labdata;

import java.util.EnumMap;
import java.util.Map;

import app.extension.LabDataExtension;
import main.DocType;

public abstract class LabData {
	EnumMap<DocType, LabDataExtension> extensionMap = new EnumMap<>(DocType.class);
	
	public Map<DocType, LabDataExtension> getExtensionMap() {
		return extensionMap;
	}

	public void addExtension(DocType extensionType, LabDataExtension extension)
	 {
		extensionMap.put(extensionType, extension);
	 }
}
