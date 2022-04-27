package main.labdata.handler;

import app.RequestData;
import app.labdata.handler.exportdata.ExportChemistryLabDataHandler;
import app.labdata.handler.exportdata.ExportLabDataHandler;
import app.labdata.handler.exportdata.ExportLabDataHandlerFactory;
import app.labdata.handler.exportdata.ExportMicroLabDataHandler;

public class ExportLabDataHandlerFactoryImpl implements ExportLabDataHandlerFactory{
	
	public ExportLabDataHandler getHandler(RequestData data) {
		if(data.getSpeciality() == 1) {
			return new ExportChemistryLabDataHandler(data);
		}
		return new ExportMicroLabDataHandler(data);
	}
}
