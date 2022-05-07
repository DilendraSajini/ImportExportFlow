package app.common.data;


public class ReportData<T> {

	private int speciality;
	
	private T importData;
	
	public int getSpeciality() {
		return speciality;
	}

	public ReportData(int speciality, T importData) {
		super();
		this.speciality = speciality;
		this.importData = importData;
	}
}
