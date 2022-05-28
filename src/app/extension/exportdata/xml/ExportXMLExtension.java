package app.extension.exportdata.xml;

import app.exportdata.labdata.ExportData;
import app.extension.exportdata.ExportLabDataExtension;
import app.parser.exportdata.ExportParser;
import app.parser.exportdata.ExportTypeParserFactory;
import app.parser.exportdata.ExportTypeParserFactoryImpl;
import main.DocType;

public class ExportXMLExtension extends ExportLabDataExtension{

	private ExportParser parser;

	public ExportXMLExtension(ExportData exportData) {
		super(exportData);
		this.exportData = exportData;
		ExportTypeParserFactory exportParserFactory = ExportTypeParserFactoryImpl.getInstance();
		parser = exportParserFactory.getTypeParserFactory(DocType.XML).getParser(this.exportData.getSpeciality(), exportData);
	}	
	
	@Override
	public String getString() {	
		return parser.getString();
	}

}