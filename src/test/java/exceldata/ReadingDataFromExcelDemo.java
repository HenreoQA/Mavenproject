package exceldata;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

// Excel files contains workbook--->sheets--->rows--->cells

public class ReadingDataFromExcelDemo {

	public static void main(String[] args) throws IOException {
		
		// To read data from excel
		
 //	FileInputStream file1 = new FileInputStream("C:\\Users\\user\\Dropbox\\PC\\Documents\\Eclipse Workspace Folder\\Webdrivermavenproject\\Testdata\\data.xlsx"); // Approach 1: to open excel file in a reading mode and inserting the file location

	FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\Testdata\\data.xlsx"); // Approach 2: to open excel file in a reading mode and inserting the file location
	
	XSSFWorkbook workbook = new XSSFWorkbook(file); // capture workbook from excel file
	
	XSSFSheet sheet = workbook.getSheet("Sheet1"); // Approach1: capture the sheet from the workbook using sheet name (sheet1)
	
//  XSSFSheet sheet = workbook.getSheetAt(0); // Approach2: capture the sheet from the workbook using index (index starts from zero)
	
	// Capture total number of rows and cells in the sheet before reading the data
	
	int totalrows= sheet.getLastRowNum(); // capture total number of rows in the sheet
	
	int totalcells = sheet.getRow(1).getLastCellNum(); // capture total number of cells (row number starts from zero, you can insert b/w 0-5 as row number. cell number starts from 1)
	
	System.out.println("Number of rows is:"+totalrows); //5
	
	System.out.println("Number of cells is:"+totalcells); //4
	
	// reading the data from the sheet using normal for loop
	
	for(int r=0; r<=totalrows; r++) 
	{
		XSSFRow currentrow = sheet.getRow(r); // reading data from rows
		
		for(int c=0; c<totalcells; c++) // reading data from cells (don't use c<=totalcells)
		{
		//	XSSFCell cell = currentrow.getCell(c); // Approach1
		//	String data = cell.toString();
			
			String celldata = currentrow.getCell(c).toString(); // approach2
			
			System.out.print(celldata+"    ");
			
		}
		
		System.out.println();
	}
	
	  workbook.close(); // close the workbook after reading the data to save the memory
	
	  file.close(); // close the file after reading the data to save the memory
	
	
	
	
	
	}

}
