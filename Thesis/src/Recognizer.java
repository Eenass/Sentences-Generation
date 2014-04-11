import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;

import antlr.JavaLexer;
import antlr.JavaParser;


public class Recognizer {
	static String time = Long.toString(System.currentTimeMillis());
	static boolean results = new File("..\\Thesis\\src\\testResults\\" + time).mkdirs();
	public static void main (String[] args){
		
		System.out.println("Start program");
		List<String> files = getFiles();
		parseFiles(files);
		System.out.println("Finish parsing");
		
	}

	private static List<String> getFiles() {
		List<String> inputFiles = new ArrayList<String>();
		String targetDir = "C:\\Users\\E. Butrus\\Dropbox\\MASTER\\Graduation\\TestProject\\src\\ast";
		File dir = new File(targetDir);
		File[] files = dir.listFiles();
		for (File f: files){
			addFiles(inputFiles, f);
		}
		return inputFiles;
	}
	
	static List<String> addFiles(List<String> files, File file){
		List<String> inputFiles = files;
		if (file.isFile()){
			inputFiles.add(file.getAbsolutePath());
		}
		else if(file.isDirectory()){
			for(File r : file.listFiles()){
				addFiles(inputFiles, r);
			}	
		}
		return inputFiles;
	}
	
	private static void parseFiles(List<String> files) {
		for(String f: files){
			try {
				parseFile(f);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

	private static void parseFile(String f) throws FileNotFoundException, IOException {
		
		ANTLRInputStream input = new ANTLRInputStream(new FileInputStream(f));	
		JavaLexer lexer = new JavaLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		JavaParser parser = new JavaParser(tokens);
		ParserRuleContext t = parser.compilationUnit();
		reportResult(f, parser);
		
	}

	private static void reportResult(String s, JavaParser parser) {
		
		File f = new File(s);
		String filename = f.getName().replace(".java", "");
		String str = parser.getNumberOfSyntaxErrors() > 0? "No" : "Yes";
		try {
			File report = new File("..\\Thesis\\src\\testResults\\" + time +"\\"+ filename + ".txt" );
			BufferedWriter output = new BufferedWriter(new FileWriter(report));
			output.write(str);
			output.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
