package excelWrite;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {
public static void main(String[] args) throws IOException {
	
	File src = new File("E:\\selenium\\data\\abc.xlsx");
	FileInputStream read = new FileInputStream(src);
	XSSFWorkbook workbook = new XSSFWorkbook(read);
	XSSFSheet sheet = workbook.getSheetAt(0);
	        
	FileOutputStream write = new FileOutputStream(src);
	sheet.createRow(1).createCell(0).setCellValue("testing");
	workbook.write(write);
	
	System.out.println("print");
}
	
}
