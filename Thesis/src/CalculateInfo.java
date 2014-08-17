import grammarDatastructure.Grammar;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import buildAST.ASTBuilder;


public class CalculateInfo {
	static StringBuffer buffer = new StringBuffer();
	
	public static void main(String[] args) throws IOException {
		String targetDir = "..\\Thesis\\GrammartestSet\\testSetGrammar";
		File dir = new File(targetDir);
		File[] files = dir.listFiles();
		buffer.append("Grammar \t VAR \t PROD \t TERM \n");
		for (File f: files){
			if(f.getName().contains(".g4")){
				ASTBuilder astbuilder = new ASTBuilder(f.getAbsolutePath());
				Grammar grammar = astbuilder.buildGrammar();
				GrammarInformation info = new GrammarInformation(grammar);
				int nonterminals = info.getNonterminals();
				int productions = info.getProductions();
				int terms = info.getTerms();
				buffer.append(f.getName() + " \t " + nonterminals + " \t " + productions + " \t " + terms + "\n");
				
			}
		}
		printTofile();

	}

	private static void printTofile() {
		File file = new File("..\\Thesis\\results\\testResults\\information.txt");
		FileWriter fw;
		try {
			fw = new FileWriter(file, true);
			PrintWriter printer = new PrintWriter(fw);
			printer.append(buffer);
			printer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
