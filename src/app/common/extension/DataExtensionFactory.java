package app.common.extension;

import app.common.labdata.LabData;
import main.DocType;

public interface DataExtensionFactory {

	LabDataExtension getExportDataExtension(DocType type, LabData exportData);
}
