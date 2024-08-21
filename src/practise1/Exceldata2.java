package practise1;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Exceldata2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		
		//to assign value and lower the number of steps
		FileInputStream myFile1=new FileInputStream("C:\\Users\\yogee\\Downloads\\Book1.xlsx");
		 Workbook myWorkbook = WorkbookFactory.create(myFile1);
		Sheet mySheet = myWorkbook.getSheet("Sheet1");
		Row myRow = mySheet.getRow(0);
		Cell myCell = myRow.getCell(1);
		String value = myCell.getStringCellValue();
		System.out.println(value);
		
	}

}
