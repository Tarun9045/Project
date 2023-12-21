package ExcelUtils;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {
	public String getReaddata( int colno, int rowno) {
		String value="";
			try {
				FileInputStream fis=new  FileInputStream("C:\\Users\\Govind Kumar Pandey\\eclipse-workspace-java1.8\\project1\\src\\test\\resources\\Excel.xlsx");//Java FileInputStream class obtains input bytes from a file.
				XSSFWorkbook wb=new XSSFWorkbook(fis);// This class has methods to read and write Microsoft Excel and OpenOffice xml files in .xls or .xlsx format.
				XSSFSheet sheet=  wb.getSheet("Sheet1");
				value=sheet.getRow(rowno).getCell(colno).getStringCellValue();
			} catch (Exception e) {
			System.out.println("Issue in get data");//-
			}
			return value;
		
		}

}
