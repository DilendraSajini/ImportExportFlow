package app.importdata.labdata;

import app.common.labdata.LabData;

public class ImportData extends LabData{
	private int speciality;

	public int getSpeciality() {
		return speciality;
	}

	public ImportData(int speciality) {
		super();
		this.speciality = speciality;
	}
}
