package datawriting;

import grammarDatastructure.Nonterminal;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class DataWriter {

	private List<List<String>> data;
	private String foldername;
	private Nonterminal n;
	
	public DataWriter(List<List<String>> data, String foldername, Nonterminal n) {
		this.data = data;
		this.foldername = foldername;
		this.n = n;
	}

	public void writing() throws IOException{
		int count = 0;
		for(List<String> l : this.data){
			File f = new File(this.foldername + this.n.getName() +Integer.toString(count)+".java");
			count++;
			f.createNewFile();
			PrintWriter writer = new PrintWriter(f, "UTF-8");
			for(String s : l){
				if(s.equals("';'") || s.equals("'{'") || s.equals("'}'")){
					writer.print(s.replace("\'",  "") + "\n");
				}
				else if(s.equals("'EOF'")){
					writer.print("");
				}
				else{
					writer.print(s.replace("\'",  "") + " ");
				}
			}
			writer.close();
		}
	}
}
