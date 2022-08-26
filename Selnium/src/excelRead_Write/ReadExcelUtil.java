package excelRead_Write;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelUtil {

	public String exlreadUtil(int sheetNo, int rowVal,int cellVal) throws IOException {
		
		File path= new File("E:\\selenium\\data\\automation.xlsx");
		FileInputStream load= new FileInputStream(path);
		XSSFWorkbook workbook = new XSSFWorkbook(load);
		XSSFSheet sheet1 = workbook.getSheetAt(sheetNo);
		return sheet1.getRow(rowVal).getCell(cellVal).getStringCellValue();
	
	}
	public static void main(String[] args) throws IOException {
	
		ReadExcelUtil obj = new ReadExcelUtil();
		System.out.println(obj.exlreadUtil(0, 0, 0));
		System.out.println(obj.exlreadUtil(0, 0, 1));
		System.out.println(obj.exlreadUtil(0, 0, 2));
	
	}
}
