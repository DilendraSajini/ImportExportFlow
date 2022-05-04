package app;

import main.DocType;

public class ReportData<T> {

	private int speciality;
	
	private DocType docType;
	
	private T importData;
	
	public int getSpeciality() {
		return speciality;
	}

	public ReportData(int speciality, DocType docType, T importData) {
		super();
		this.speciality = speciality;
		this.docType = docType;
		this.importData = importData;
	}
}
