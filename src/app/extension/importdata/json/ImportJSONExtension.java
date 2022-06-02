package app.extension.importdata.json;

import java.util.function.BiFunction;

import app.common.persistable.PersistableData;
import app.extension.importdata.ImportLabDataExtension;
import app.importdata.labdata.ImportData;
import app.parser.importdata.ImportParser;
import app.parser.importdata.ImportTypeParserFactory;
import app.parser.importdata.ImportTypeParserFactoryImpl;
import main.DocType;

public class ImportJSONExtension<T> extends ImportLabDataExtension<T> {

	private ImportParser<T> parser;

	public ImportJSONExtension(ImportData<T> importData) {
		super(importData);
		ImportTypeParserFactory<T> importParserFactory = new ImportTypeParserFactoryImpl<>();
		parser = importParserFactory.getTypeParserFactory(DocType.JSON).getParser(this.importData.getSpeciality(), importData);
	}

	@Override
	public PersistableData processData(BiFunction<String, T, PersistableData> supplier) {
		return parser.processData(supplier);	
	}

}
