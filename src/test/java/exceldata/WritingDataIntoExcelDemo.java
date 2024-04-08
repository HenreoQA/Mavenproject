package exceldata;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//Excel files contains workbook--->sheets--->rows--->cells

public class WritingDataIntoExcelDemo {

	public static void main(String[] args) throws IOException {
		
		// To write data into excel
		
// FileOutputStream file1 = new FileOutputStream("C:\\Users\\user\\Dropbox\\PC\\Documents\\Eclipse Workspace Folder\\Webdrivermavenproject\\Testdata\\newfile.xlsx"); // Approach 1: to open excel file in a writing mode and inserting the file location

		
FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"\\Testdata\\newfile.xlsx"); // Approach 2: to open excel file in a writing mode and inserting the file location
		
	XSSFWorkbook workbook = new XSSFWorkbook();	// create workbook
	
    XSSFSheet sheet = workbook.createSheet(); // create sheet
    
    // Approach1 --- without using for loop
    
    XSSFRow row1 = sheet.createRow(0); // create first row (row starts from zero)
    
    // create cells, and write data in the cells
    
    row1.createCell(0).setCellValue("welcome");
    row1.createCell(1).setCellValue("1234");
    row1.createCell(2).setCellValue("automation");
    
    XSSFRow row2 = sheet.createRow(1); // create second row
    
    // create cells, and write data in the cells
    
    row2.createCell(0).setCellValue("abcd");
    row2.createCell(1).setCellValue("testing");
    row2.createCell(2).setCellValue("5678"); 
    
    
    // Appoach2 --- using for loop
    
  /*  Scanner sc = new Scanner(System.in);
    
    for(int r=0; r<=3; r++)
    {
    	XSSFRow currentrow = sheet.createRow(r); // creating rows
    	
    	for(int c=0; c<2; c++) // creating cells
    	{
    	   System.out.println("enter a value");
    	   String value = sc.next();
    	   currentrow.createCell(r).setCellValue(value);
    	}
    } */
    
   workbook.write(file); // attach workbook to the excel file
    
    workbook.close(); // close the workbook
    file.close(); // close the excel file
    
    System.out.println("writing is done"); // print a message when the writing is done
    
    
		

	}

}
