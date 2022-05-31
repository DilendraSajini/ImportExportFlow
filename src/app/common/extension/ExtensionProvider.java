package app.common.extension;

import java.util.EnumMap;
import java.util.Map;

import app.common.labdata.LabData;
import main.DocType;

public abstract class ExtensionProvider {

	protected EnumMap<DocType, LabDataExtension> extensionMap;

	public abstract Map<DocType, LabDataExtension> getExtensionMap(LabData data);

	public ExtensionProvider() {
		this.extensionMap = new EnumMap<>(DocType.class);
	}
}
