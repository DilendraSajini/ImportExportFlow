package app.extension.json;

import app.extension.LabDataExtension;
import app.parser.json.JSONParserFactory;

public abstract class JSONExtension implements LabDataExtension{

	 JSONParserFactory parserFactory;
	
	public JSONExtension(JSONParserFactory parserFactory) {
		super();
		this.parserFactory = parserFactory;
	}
}
