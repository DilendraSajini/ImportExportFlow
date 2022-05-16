package app.importdata.parser;

import app.importdata.parser.json.JSONImportParserFactoryImpl;
import app.importdata.parser.xml.XMLImportParserFactoryImpl;
import main.DocType;

public class ImportTypeParserFactoryImpl implements ImportTypeParserFactory{
	
	@Override
	public ImportParserFactory getTypeParserFactory(DocType type) {
		if(type == DocType.XML) {
			return new XMLImportParserFactoryImpl();	
		}
		return new JSONImportParserFactoryImpl();
	}
}

