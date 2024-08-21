package practise1;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Exceldata1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		//Read single data
		
		FileInputStream myFile=new FileInputStream("C:\\Users\\yogee\\Downloads\\Book1.xlsx");
		String value = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		System.out.println("Job Offer as a Automation tester is from " +value);

	}

}
