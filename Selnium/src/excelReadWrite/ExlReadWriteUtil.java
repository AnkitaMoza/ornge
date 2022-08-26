package excelReadWrite;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExlReadWriteUtil {

	
public void  write(int sheetIndex, int rowIndex, int cellIndex, String dataIn) throws IOException 
{
	File path = new File("E:\\selenium\\data\\readWrite.xlsx");
	FileInputStream src = new FileInputStream(path);
	XSSFWorkbook workbook =new XSSFWorkbook(src);
	XSSFSheet Sheet = workbook.getSheetAt(sheetIndex);
	
	FileOutputStream exlwrite = new FileOutputStream(path);
	Sheet.createRow(rowIndex).createCell(cellIndex).setCellValue(dataIn);
	workbook.write(exlwrite);
	}
public void  write(int sheetIndex, int rowIndex, int cellIndex, double dataIn) throws IOException 
{
	File path = new File("E:\\selenium\\data\\readWrite.xlsx");
	FileInputStream src = new FileInputStream(path);
	XSSFWorkbook workbook =new XSSFWorkbook(src);
	XSSFSheet Sheet = workbook.getSheetAt(sheetIndex);
	
	FileOutputStream exlwrite = new FileOutputStream(path);
	Sheet.createRow(rowIndex).createCell(cellIndex).setCellValue(dataIn);
	workbook.write(exlwrite);
	}

public String readString(int sheetindex, int rowIndex, int cellIndex) throws IOException {
	File path = new File("E:\\selenium\\data\\readWrite.xlsx");
	FileInputStream src = new FileInputStream(path);
	XSSFWorkbook workbook = new XSSFWorkbook(src);
	XSSFSheet sheet = workbook.getSheetAt(0);
	return sheet.getRow(0).getCell(0).getStringCellValue();
}
public double readNumeric(int sheetindex, int rowIndex, int cellIndex) throws IOException {
	File path = new File("E:\\selenium\\data\\readWrite.xlsx");
	FileInputStream src = new FileInputStream(path);
	XSSFWorkbook workbook = new XSSFWorkbook(src);
	XSSFSheet sheet = workbook.getSheetAt(0);
	return  sheet.getRow(0).getCell(0).getNumericCellValue();
}
public static void main(String[] args) throws IOException {
	ExlWriteRead re = new ExlWriteRead();
	re.write(0, 1, 0,"mayur");
	re.write(0, 1, 1, "10/Jan");
	re.write(0, 1, 2, 1996);
	System.out.println(re.readNumeric(0, 1, 0));
}
}
