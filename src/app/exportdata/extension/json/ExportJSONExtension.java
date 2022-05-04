package app.exportdata.extension.json;

import app.exportdata.extension.ExportLabDataExtension;
import app.exportdata.labdata.ExportData;
import app.exportdata.parser.JSONExportParserFactory;
import app.exportdata.parser.json.ExportJSONParser;
import app.exportdata.parser.json.JSONExportParserFactoryImpl;

public class ExportJSONExtension implements ExportLabDataExtension {

	private ExportJSONParser parser;
	
	private ExportData exportData;

	public ExportJSONExtension(ExportData exportData) {
		super();
		this.exportData = exportData;
		JSONExportParserFactory parserFactory = new JSONExportParserFactoryImpl();
		parser = parserFactory.getJSONParser(this.exportData.getSpeciality());
		parser.setData(this.exportData);
	}

	@Override
	public String getString() {
		return parser.getJSONString();
	}

}
