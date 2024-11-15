package genericutility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 * @author Bhavani
 */
public class Excelutility {
	/**
	 * This method is used to read string data from excel
	 * user must pass sheetName ,rowIndex,ColIndex
	 * @param sheetName
	 * @param rowIndex
	 * @param colIndex
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public String getStringDatafromExcel(String sheetName,int rowIndex,int colIndex) throws EncryptedDocumentException, IOException {
	 FileInputStream fis = new FileInputStream("./src/test/resources/TestData/Testscriptdata.xlsx");
	Workbook Workbook = WorkbookFactory.create(fis);
	 return Workbook.getSheet(sheetName).getRow(rowIndex).getCell(colIndex).getStringCellValue();

}
}
