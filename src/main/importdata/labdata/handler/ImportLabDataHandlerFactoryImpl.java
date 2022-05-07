package main.importdata.labdata.handler;

import app.common.data.ReportData;
import app.importdata.labdata.handler.ImportChemistryLabDataHandler;
import app.importdata.labdata.handler.ImportLabDataHandler;
import app.importdata.labdata.handler.ImportLabDataHandlerFactory;
import app.importdata.labdata.handler.ImportMicrobiologyLabDataHandler;

public class ImportLabDataHandlerFactoryImpl<T> implements ImportLabDataHandlerFactory<T> {

	@Override
	public ImportLabDataHandler getHandler(ReportData<T> data) {
		if (data.getSpeciality() == 0) {
			return new ImportChemistryLabDataHandler<>(data);
		}
		return new ImportMicrobiologyLabDataHandler<>(data);
	}
}
