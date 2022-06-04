package app.parser.exportdata;

import java.util.function.Function;

import app.common.labdata.LabData;
import app.common.persistable.PersistableData;

public abstract class ExportParser {

	protected LabData exportData;

	public ExportParser(LabData exportData) {
		super();
		this.exportData = exportData;
	}

	public abstract PersistableData processData(Function<String, PersistableData> supplier);
}
