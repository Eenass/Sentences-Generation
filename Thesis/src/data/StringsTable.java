package data;

import java.util.HashMap;
import java.util.Map;

public class StringsTable {

	private Map<String, String> regular;
	
	public StringsTable() {
		this.regular = new HashMap<String, String>();
		fillMap();
	}

	private void fillMap() {
		this.regular.put("[lL]", "L");
		this.regular.put("[1-9]", "9");
		this.regular.put("[xX]", "x");
		this.regular.put("[0-9a-fA-F]", "0");
		this.regular.put("[0-7]", "6");
		this.regular.put("[bB]", "b");
		this.regular.put("[01]", "1");
		this.regular.put("[eE]", "E");
		this.regular.put("[+-]", "-");
		this.regular.put("[fFdD]", "D");
		this.regular.put("[pP]", "p");
		this.regular.put("[0-3]", "2");
		this.regular.put("[a-zA-Z$_]", "y");
		this.regular.put("~[\u0000-\u00FF\uD800-\uDBFF]", "\u01FF");
		this.regular.put("[\uD800-\uDBFF]", "\uD800");
		this.regular.put("[\uDC00-\uDFFF]", "\uDC00");
		this.regular.put("[a-zA-Z0-9$_]", "h");
		this.regular.put("'\\'", "\\");
		this.regular.put("[btnfr\"\'\\]", "\b");
		this.regular.put("~[\"\\]", "\\\"");
		this.regular.put("~['\\]", "c");
		
	}

	public Map<String, String> getRegular() {
		return regular;
	}


}
