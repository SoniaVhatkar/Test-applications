package Base;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/*
 * @Methodname   : getRowCount
 * @Description  : This is common method that reads multiple data from excel
 * @Param        : String path, String sheetname
 * @Return		 : returns row count, string column value
 * @Author		 : Sonia Vhatkar
 */

public class Data_driven_xl {
	
	public static int getRowCount(String path, String sheet) {
		int rc = 0;
		try {
			Workbook wb = WorkbookFactory.create(new FileInputStream(path));
			rc = wb.getSheet(sheet).getLastRowNum();
		} catch (EncryptedDocumentException | IOException e) {
			e.printStackTrace();
		}
		return rc;
	}

	/*
	 * @Methodname : getData
	 * @Description : This is common method that reads multiple data from excel
	 * @Param : String path, String sheetname, int row, int column
	 * @Return : returns string column value
	 * @Author : Sonia Vhatkar
	 */
	
	public static String getData(String path, String sheet, int r, int c) {
		String val = "";
		try {
			Workbook wb = WorkbookFactory.create(new FileInputStream(path));
			val = wb.getSheet(sheet).getRow(r).getCell(c).getStringCellValue();
		} catch (EncryptedDocumentException | IOException e) {
			e.printStackTrace();
		}
		return val;

	}
}
