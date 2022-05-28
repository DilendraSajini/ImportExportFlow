package app.extension.exportdata.json;

import app.exportdata.labdata.ExportData;
import app.extension.exportdata.ExportLabDataExtension;
import app.parser.exportdata.ExportParser;
import app.parser.exportdata.ExportTypeParserFactory;
import app.parser.exportdata.ExportTypeParserFactoryImpl;
import main.DocType;

public class ExportJSONExtension extends ExportLabDataExtension {

	private ExportParser parser;

	public ExportJSONExtension(ExportData exportData) {
		super(exportData);
		this.exportData = exportData;
		ExportTypeParserFactory exportParserFactory = ExportTypeParserFactoryImpl.getInstance();
		parser = exportParserFactory.getTypeParserFactory(DocType.JSON).getParser(this.exportData.getSpeciality(), exportData);
	}

	@Override
	public String getString() {
		return parser.getString();
	}

}
