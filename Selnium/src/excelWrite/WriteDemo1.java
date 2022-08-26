package excelWrite;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.io.FileHandler;

public class WriteDemo1 {
public static void main(String[] args) throws IOException {
	
	File path = new File("E:\\selenium\\data\\automation.xlsx");
	FileInputStream read = new FileInputStream(path);
	XSSFWorkbook workbook = new XSSFWorkbook(read);
	XSSFSheet sheet = workbook.getSheetAt(0);
	
	FileOutputStream write = new FileOutputStream(path);
	sheet.createRow(0).createCell(0).setCellValue("dilip");
	workbook.write(write);
}
	
}		

