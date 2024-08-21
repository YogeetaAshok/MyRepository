package practise1;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Exceldata4 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub

		//to read complete data
		FileInputStream myFile=new FileInputStream("C:\\Users\\yogee\\Downloads\\Book1.xlsx");
		Sheet mySheet = WorkbookFactory.create(myFile).getSheet("Sheet1");
	
		
		for(int i=0;i<=2;i++)
		{
		
		for (int j=0;j<=1;j++)
		{
			String value = mySheet.getRow(i).getCell(j).getStringCellValue();
			System.out.print(value+ " ");
		}
			System.out.println();	
		}
	}

}
