package app.parser.exportdata;

import java.util.function.Function;

import app.common.labdata.LabData;

public abstract class ExportParser {

	protected LabData exportData;

	public ExportParser(LabData exportData) {
		super();
		this.exportData = exportData;
	}

	public abstract <U> U processData(Function<String, U> supplier);
}
