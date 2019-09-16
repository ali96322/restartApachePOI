package restartApachePoi;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Parameterization
{
	public static void main(String[] args)
	{
		try
		{
			FileInputStream fin = new FileInputStream("G:\\selenium tool\\restartApachePoi\\src\\testData\\test.xlsx");
			XSSFWorkbook workbook = new XSSFWorkbook(fin);
			Sheet sheet = workbook.getSheet("testdata");
			Row row = sheet.getRow(1);
			Cell cell = row.getCell(0);
			String data = cell.toString();
			System.out.println("username :" +data);
			
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}
