package app.common.persistable;

import app.common.data.ReportData;

public class PersistableData<T> {

	private String finalImportOutput;

	public PersistableData(String outputMsg) {
		this.finalImportOutput = outputMsg;
	}
			
	public PersistableData(String outputMsg, T data) {
		this.finalImportOutput = outputMsg + data;
	}

	public String getFinalImportOutput() {
		return finalImportOutput;
	}
	
	public PersistableData(String outputMsg, ReportData<T> reportData) {
		this.finalImportOutput = outputMsg + reportData.getImportData();
	}
}
