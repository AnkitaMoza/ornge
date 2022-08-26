package excelRead_Write;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDemo1 {

	public static void main(String[] args) throws IOException {
		
	File path = new File("E:\\selenium\\data\\automation.xlsx");
	FileInputStream load =new FileInputStream(path);
	XSSFWorkbook workbook = new XSSFWorkbook(load);
	XSSFSheet sheet1 = workbook.getSheetAt(0);
	String data = sheet1.getRow(0).getCell(1).getStringCellValue();
	System.out.println(data);
	
	
	}

}