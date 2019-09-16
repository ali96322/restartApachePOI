package restartApachePoi;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Util
{
	static FileInputStream fin = null;
	static XSSFWorkbook workbook = null;
	static String data = null;
	
	public static String getData(String filename, String sheetname, int rowNum, int cellNum)
	{
		try
		{
			fin = new FileInputStream(filename);
			workbook = new XSSFWorkbook(fin);
			Sheet sheet = workbook.getSheet(sheetname);
			Row row = sheet.getRow(rowNum);
			Cell cell = row.getCell(cellNum);
			data = cell.toString();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return data;
	}
}
