package app.extension.json;

import app.labdata.ExportData;
import app.parser.json.ExportJSONParser;
import app.parser.json.JSONParser;
import app.parser.json.JSONParserFactory;

public class ExportJSONExtension extends JSONExtension {

	private ExportData exportData;

	public ExportJSONExtension(ExportData exportData, JSONParserFactory jsonParserFactory) {
		super(jsonParserFactory);
		this.exportData = exportData;
	}

	@Override
	public String getString() {
		JSONParser parser = parserFactory.getJSONParser(exportData.getSpeciality());
		((ExportJSONParser) parser).setData(exportData);
		return parser.getJSONString();
	}

}
