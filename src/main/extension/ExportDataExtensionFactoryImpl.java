package main.extension;

import app.extension.DataExtensionFactory;
import app.extension.LabDataExtension;
import app.extension.json.ExportJSONExtension;
import app.extension.xml.ExportXMLExtension;
import app.labdata.ExportData;
import app.labdata.LabData;
import main.DocType;
import main.parser.JSONParserFactoryImpl;
import main.parser.XMLParserFactoryImpl;

public class ExportDataExtensionFactoryImpl implements DataExtensionFactory{

	public LabDataExtension getExportDataExtension(DocType type, LabData exportData) {
		if (type == DocType.XML) {
			return new ExportXMLExtension((ExportData)exportData, new XMLParserFactoryImpl());
		}
		else {
			return new ExportJSONExtension((ExportData)exportData, new JSONParserFactoryImpl());
		}
	}
}
