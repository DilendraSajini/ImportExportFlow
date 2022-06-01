package app.extension.exportdata;

import java.util.function.Function;

import app.common.extension.LabDataExtension;
import app.exportdata.labdata.ExportData;

public abstract class ExportLabDataExtension implements LabDataExtension{

	protected ExportData exportData;
	
	public ExportLabDataExtension(ExportData exportData) {
		this.exportData = exportData;
	}

	public abstract <U> U processData(Function<String, U> supplier);
}
