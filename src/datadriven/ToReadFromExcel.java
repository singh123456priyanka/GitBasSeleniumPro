package datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ToReadFromExcel {

	public static void main(String[] args) throws IOException {

		//step 1 Create object of InputStream
		
		File abspath= new File("./testData/testData.xls");
		FileInputStream fis= new FileInputStream(abspath);
		
		//step 2 Create object of file type
		
		//Workbook wb= new XSSFWorkbook(fis);
		Workbook wb= WorkbookFactory.create(fis);
		
		//3 Read methods
		double num = wb.getSheet("number").getRow(5).getCell(1).getNumericCellValue();
		String str = wb.getSheet("string").getRow(2).getCell(3).getStringCellValue();
	    Date dt = wb.getSheet("date").getRow(8).getCell(2).getDateCellValue();
	    boolean bool = wb.getSheet("boolean").getRow(10).getCell(1).getBooleanCellValue();
	    
		
		
		System.out.println(num);
		System.out.println(str);                             
		System.out.println(dt);                             
		System.out.println(bool);                             

		
		
	}
	 

}
