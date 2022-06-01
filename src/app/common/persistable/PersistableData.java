package app.common.persistable;

import main.XMLHolder;

public class PersistableData {

	private String finalImportOutput;

	public PersistableData(String outputMsg) {
		this.finalImportOutput = outputMsg;
	}

	public String getFinalImportOutput() {
		return finalImportOutput;
	}

	public PersistableData(String outputMsg, String data) {
		this.finalImportOutput = outputMsg + data;
	}

	public PersistableData(String outputMsg, XMLHolder data) {
		this.finalImportOutput = outputMsg + data.getXml();
	}
}
