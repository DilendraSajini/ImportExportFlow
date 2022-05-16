package app.exportdata.extension.xml;

import app.common.labdata.LabData;
import app.exportdata.extension.ExportLabDataExtension;
import app.exportdata.parser.ExportParser;
import app.exportdata.parser.ExportTypeParserFactory;
import app.exportdata.parser.ExportTypeParserFactoryImpl;
import main.DocType;

public class ExportXMLExtension extends ExportLabDataExtension{

	private ExportParser parser;

	public ExportXMLExtension(LabData exportData) {
		super(exportData);
		this.exportData = exportData;
		ExportTypeParserFactory exportParserFactory = new ExportTypeParserFactoryImpl();
		parser = exportParserFactory.getTypeParserFactory(DocType.XML).getParser(this.exportData.getSpeciality(), exportData);
	}	
	
	@Override
	public String getString() {	
		return parser.getString();
	}

}
