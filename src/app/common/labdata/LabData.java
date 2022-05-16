package app.common.labdata;

import java.util.EnumMap;
import java.util.Map;

import app.common.extension.LabDataExtension;
import main.DocType;

public abstract class LabData {
	private EnumMap<DocType, LabDataExtension> extensionMap = new EnumMap<>(DocType.class);
	
	private int speciality;
	
	public Map<DocType, LabDataExtension> getExtensionMap() {
		return extensionMap;
	}
	
	public int getSpeciality() {
		return speciality;
	}

	public void addExtension(DocType extensionType, LabDataExtension extension)
	 {
		extensionMap.put(extensionType, extension);
	 }

	public LabData(int speciality) {
		this.speciality = speciality;
		this.extensionMap = new EnumMap<>(DocType.class);
	}
}
