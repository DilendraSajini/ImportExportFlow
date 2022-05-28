package app.common.extension;

import java.util.EnumMap;

import app.common.labdata.LabData;
import main.DocType;

public interface ImportExtensionProvider {

	EnumMap<DocType, LabDataExtension> getImportExtensionMap(LabData data);

}
