package app.common.extension;

import java.util.EnumMap;

import app.common.labdata.LabData;
import main.DocType;

public interface ExportExtensionProvider {

	EnumMap<DocType, LabDataExtension> getExportExtensionMap(LabData data);

}
