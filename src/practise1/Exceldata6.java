package practise1;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Exceldata6 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
//total row and column count
		FileInputStream myFile=new FileInputStream("C:\\Users\\yogee\\Downloads\\Book1.xlsx");
		Sheet mySheet = WorkbookFactory.create(myFile).getSheet("Sheet1");
		int totalNumberOfRows = mySheet.getLastRowNum();
		System.out.println(totalNumberOfRows);
		int LastRownumber=totalNumberOfRows;
		int totalNumberOfColumns=mySheet.getRow(0).getLastCellNum();
		System.out.println(totalNumberOfColumns);
		int LastColumnNumber=totalNumberOfColumns-1;
		
		for(int i=0;i<=LastRownumber;i++)
		{
		
		for (int j=0;j<=LastColumnNumber;j++)
		{
			 Cell myCell = mySheet.getRow(i).getCell(j);
			 CellType cellType = myCell.getCellType();
			
			if(cellType==CellType.NUMERIC)
			{
				double value = myCell.getNumericCellValue();
				System.out.print(value+" ");
			}
			else
			{
				String stringvalue = myCell.getStringCellValue();
				System.out.print(stringvalue+" ");
			}
		}
			System.out.println();	
		}
	}

}
