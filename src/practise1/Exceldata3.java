package practise1;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Exceldata3 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub

		FileInputStream myFile=new FileInputStream("C:\\Users\\yogee\\Downloads\\Book1.xlsx");
		Sheet mySheet = WorkbookFactory.create(myFile).getSheet("Sheet1");
		//to read all the row 
		
		for(int i=0;i<=1;i++)
		{
			String value = mySheet.getRow(0).getCell(i).getStringCellValue();
	    System.out.print(value+ " ");
		}
		System.out.println();
		System.out.println("====================================");
		
		for(int i=0;i<=1;i++)
		{
			String value = mySheet.getRow(1).getCell(i).getStringCellValue();
	    System.out.print(value+ " ");
		}
		System.out.println();
		System.out.println("====================================");
		
		
		//to read all the column
		for(int j=0;j<=2;j++)
		{
			String value2 = mySheet.getRow(j).getCell(0).getStringCellValue();
		System.out.println(value2+ " ");
		}
		System.out.println();
		System.out.println("====================================");
		
		for(int j=0;j<=2;j++)
		{
			String value2 = mySheet.getRow(j).getCell(1).getStringCellValue();
		System.out.println(value2+ " ");
		}
		System.out.println();
		System.out.println("====================================");
		
	}

}
