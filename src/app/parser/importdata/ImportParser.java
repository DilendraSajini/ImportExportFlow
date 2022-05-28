package app.parser.importdata;

import app.importdata.labdata.ImportData;

public abstract class ImportParser<T> {
	
	protected ImportData<T> importData;

	public abstract Object getObject();

	public ImportParser(ImportData<T> importData) {
		super();
		this.importData = importData;
	}
}
