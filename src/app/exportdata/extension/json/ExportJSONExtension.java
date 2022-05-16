package app.exportdata.extension.json;

import app.exportdata.extension.ExportLabDataExtension;
import app.exportdata.labdata.ExportData;
import app.exportdata.parser.ExportParser;
import app.exportdata.parser.ExportTypeParserFactory;
import app.exportdata.parser.ExportTypeParserFactoryImpl;
import main.DocType;

public class ExportJSONExtension extends ExportLabDataExtension {

	private ExportParser parser;

	public ExportJSONExtension(ExportData exportData) {
		super(exportData);
		this.exportData = exportData;
		ExportTypeParserFactory exportParserFactory = new ExportTypeParserFactoryImpl();
		parser = exportParserFactory.getTypeParserFactory(DocType.JSON).getParser(this.exportData.getSpeciality(), exportData);
	}

	@Override
	public String getString() {
		return parser.getString();
	}

}
