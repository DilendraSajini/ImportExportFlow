package app.common.labdata;

import java.util.EnumMap;
import java.util.Map;

import app.common.extension.LabDataExtension;
import main.DocType;

public abstract class LabData {
	protected Map<DocType, LabDataExtension> extensionMap;

	private int speciality;

	public void setExtensionMap(Map<DocType, LabDataExtension> extensionMap) {
		this.extensionMap = extensionMap;
	}

	public Map<DocType, LabDataExtension> getExtensionMap() {
		return extensionMap;
	}

	public int getSpeciality() {
		return speciality;
	}

	public LabData(int speciality) {
		this.speciality = speciality;
		this.extensionMap = new EnumMap<>(DocType.class);
	}
}
