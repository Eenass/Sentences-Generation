import java.io.File;
import java.io.IOException;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.Number;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;


public class WritingExcel {

	public static void main(String[] args) throws RowsExceededException, WriteException, IOException {
		printToExcel();

	}
	
	static void printToExcel() throws IOException, RowsExceededException, WriteException{
		WritableWorkbook workbook = Workbook.createWorkbook(new File("..\\Thesis\\src\\testResults\\output.xls"));

		WritableSheet sheet = workbook.createSheet("First Sheet", 0);
		
		Label label = new Label(0,0, "A label record"); 
		sheet.addCell(label); 

		label = new Label(1, 0, "B"); 
		sheet.addCell(label); 
		
		Number number = new Number(0, 3, 3.1459); 
		sheet.addCell(number);
		number = new Number(0, 4, 4.1459);
		sheet.addCell(number);
		number = new Number(0, 5, 5.1459); 
		sheet.addCell(number);
		workbook.write();
		workbook.close();
	}

}
