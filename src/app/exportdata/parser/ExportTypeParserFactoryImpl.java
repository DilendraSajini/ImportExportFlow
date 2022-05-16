package app.exportdata.parser;

import app.exportdata.parser.json.JSONExportParserFactoryImpl;
import app.exportdata.parser.xml.XMLExportParserFactoryImpl;
import main.DocType;

public class ExportTypeParserFactoryImpl implements ExportTypeParserFactory{

	@Override
	public ExportParserFactory getTypeParserFactory(DocType type) {
		if(type == DocType.XML) {
			return new XMLExportParserFactoryImpl();	
		}
		return new JSONExportParserFactoryImpl();
	}
}
