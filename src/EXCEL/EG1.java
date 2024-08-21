package EXCEL;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class EG1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//locate your excel file
		FileInputStream myFile=new FileInputStream("C:\\Users\\yogee\\Downloads\\Excel test.xlsx");
		//String value = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		//System.out.println(value);
		 boolean boo = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(3).getCell(0).getBooleanCellValue();
		 System.out.println(boo);
	}

}
