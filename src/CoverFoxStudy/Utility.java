package CoverFoxStudy;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Utility {

	public static String readDataFromExcel(String filePath, String sheetName, int
			rowNum, int cellNum)

			throws EncryptedDocumentException, IOException {
			FileInputStream myFile = new FileInputStream(filePath);
			String value =WorkbookFactory.create(myFile).getSheet(sheetName).getRow(rowNum).getCell(cellNum).getStringCellValue();

			return value;
			}
			
}
