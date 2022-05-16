//package main.exportdata.labdata.handler;
//
//import app.common.data.RequestData;
//import app.exportdata.labdata.handler.ExportChemistryDataHandler;
//import app.exportdata.labdata.handler.ExportDataHandler;
//import app.exportdata.labdata.handler.ExportDataHandlerFactory;
//import app.exportdata.labdata.handler.ExportMicroDataHandler;
//
//public class ExportDataHandlerFactoryImpl implements ExportDataHandlerFactory{
//	
//	public ExportDataHandler getHandler(RequestData data) {
//		if(data.getSpeciality() == 0) {
//			return new ExportChemistryDataHandler(data);
//		}
//		return new ExportMicroDataHandler(data);
//	}
//}
