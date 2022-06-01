package app.importdata.persistable;

public class PersistableData<T> {

	private String finalImportOutput;

	public PersistableData(String outputMsg, T importData) {
		this.finalImportOutput = outputMsg + importData;
	}

	public String getFinalImportOutput() {
		return finalImportOutput;
	}
}
