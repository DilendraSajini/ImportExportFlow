package main.exportdata.labdata.handler;

import app.common.data.RequestData;
import app.exportdata.labdata.handler.ExportChemistryLabDataHandler;
import app.exportdata.labdata.handler.ExportLabDataHandler;
import app.exportdata.labdata.handler.ExportLabDataHandlerFactory;
import app.exportdata.labdata.handler.ExportMicroLabDataHandler;

public class ExportLabDataHandlerFactoryImpl implements ExportLabDataHandlerFactory{
	
	public ExportLabDataHandler getHandler(RequestData data) {
		if(data.getSpeciality() == 0) {
			return new ExportChemistryLabDataHandler(data);
		}
		return new ExportMicroLabDataHandler(data);
	}
}
