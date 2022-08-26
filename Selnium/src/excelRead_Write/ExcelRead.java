package excelRead_Write;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {

	public static void main(String[] args) throws IOException {
		
	//get path of excel file
		File path =new File("E:\\selenium\\data\\automation.xlsx");
	
	//load excel file
		FileInputStream load = new FileInputStream(path);
		
	//wprkbook of Excel
		XSSFWorkbook workbook = new XSSFWorkbook(load);
		
	//get Sheet from the workbook
		XSSFSheet sheet1 = workbook.getSheetAt(4);
		
	//get cell to read data
		String data = sheet1.getRow(4).getCell(2).getStringCellValue();
		System.out.println(data);
	}
}
