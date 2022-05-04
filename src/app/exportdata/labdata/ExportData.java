package app.exportdata.labdata;

import app.common.labdata.LabData;

public class ExportData extends LabData {

	private int speciality;

	public int getSpeciality() {
		return speciality;
	}

	public ExportData(int speciality) {
		super();
		this.speciality = speciality;
	}
}
