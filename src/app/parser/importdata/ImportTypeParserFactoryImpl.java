package app.parser.importdata;

import app.parser.importdata.json.JSONImportParserFactoryImpl;
import app.parser.importdata.xml.XMLImportParserFactoryImpl;
import main.DocType;

public class ImportTypeParserFactoryImpl<T> implements ImportTypeParserFactory<T>{
	
	@Override
	public ImportParserFactory<T> getTypeParserFactory(DocType type) {
		if(type == DocType.XML) {
			return new XMLImportParserFactoryImpl<T>();	
		}
		return new JSONImportParserFactoryImpl<T>();
	}
}

