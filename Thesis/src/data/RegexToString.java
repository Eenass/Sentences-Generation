package data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import nl.flotsam.xeger.Xeger;

public class RegexToString {

	public static void main(String[] args) {
		List<String> regularExp = new ArrayList<String>(Arrays.asList("[lL]", "[1-9]", "[xX]", "[0-9a-fA-F]", "[0-7]", "[bB]", "[01]", "[eE]",
				"[+-]", "[fFdD]", "[pP]", "[0-3]", "[a-zA-Z$_]", "~[\u0000-\u00FF\uD800-\uDBFF]", "[\uD800-\uDBFF]", "[\uDC00-\uDFFF]",
				"[a-zA-Z0-9$_]"));
		String regex = "";
		for(String r : regularExp){
			regex = r;
			Xeger generator = new Xeger(regex);
			String result = generator.generate();
			System.out.println("regex " + regex + " result " + result);
			assert result.matches(regex);
		}	

	}

}
