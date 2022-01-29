package week5.day1;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class ReadExcel {

	public static String[][] readExcel(String fileName) throws IOException {
		// TODO Auto-generated method stub
		
		
XSSFWorkbook wb = new XSSFWorkbook ("./data/"+fileName+".xlsx");
XSSFSheet ws =wb.getSheet("Sheet1");
int rowcount = ws.getLastRowNum();
int lastCellNum = ws.getRow(0).getLastCellNum();
String [][] data = new String[rowcount][lastCellNum];

for (int i=1 ;i <rowcount;i++)
{
	XSSFRow row = ws.getRow(i);
	for (int j=0; j<lastCellNum;j++) {

XSSFCell cell = row.getCell(j);
String stringCellValue = cell.getStringCellValue();
System.out.println(stringCellValue);
System.out.println();
data[i-1][j]=stringCellValue;
}
}

		
		wb.close();
		return data;
	}

	

}

		
	


