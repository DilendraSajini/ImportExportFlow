package app.extension;

import app.labdata.ChemistryExportData;
import main.DocType;

public interface ImportDataExtensionFactoryImpl<T> {

LabDataExtension getImportDataExtension(DocType json, ChemistryExportData<T> chemistryExportData);

}
