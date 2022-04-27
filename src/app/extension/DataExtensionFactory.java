package app.extension;

import app.labdata.LabData;
import main.DocType;

public interface DataExtensionFactory {

	LabDataExtension getExportDataExtension(DocType type, LabData exportData);
}
