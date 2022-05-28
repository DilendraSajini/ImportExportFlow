package app.parser.exportdata;

import app.parser.exportdata.json.JSONExportParserFactoryImpl;
import app.parser.exportdata.xml.XMLExportParserFactoryImpl;
import main.DocType;

public class ExportTypeParserFactoryImpl implements ExportTypeParserFactory {
	
	private static class InstanceHolder {
		private static final ExportTypeParserFactoryImpl INSTANCE = new ExportTypeParserFactoryImpl();
	}

	private ExportTypeParserFactoryImpl() {

	}

	public static ExportTypeParserFactoryImpl getInstance() {
		return InstanceHolder.INSTANCE;
	}

	@Override
	public ExportParserFactory getTypeParserFactory(DocType type) {
		if (type == DocType.XML) {
			return new XMLExportParserFactoryImpl();
		}
		return new JSONExportParserFactoryImpl();
	}
}
