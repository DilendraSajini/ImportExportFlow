package app.common.extension;

import java.util.EnumMap;

import app.common.labdata.LabData;
import main.DocType;

public interface ExtensionProvider {

	EnumMap<DocType, LabDataExtension> getExtensionMap(LabData data);
}
