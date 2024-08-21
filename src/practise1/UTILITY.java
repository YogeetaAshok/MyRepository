package practise1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;


public class UTILITY {
	@DataProvider(name="cricketPlayers")
	
	public String[][] mydata() throws EncryptedDocumentException, IOException
	{
		String[][] testdata = readDataFromExcel("utility", "Sheet1");
		return testdata;
	}
	
	public static String[][] readDataFromExcel(String excelFileName , String sheetName) throws EncryptedDocumentException, IOException
	//{String path = System.getProperty("user.dir")+"\\utility.xlsx" ;//if the data was static
	{String path = System.getProperty("user.dir")+"\\"+excelFileName+".xlsx" ;//for dynamic data
	FileInputStream myFile=new FileInputStream(path);
	//Sheet mySheet = WorkbookFactory.create(myFile).getSheet("Sheet1"//if the data was static
	Sheet mySheet = WorkbookFactory.create(myFile).getSheet(sheetName); //for dynamic data
	int totalRows = mySheet.getLastRowNum();
	int totalColumns = mySheet.getRow(0).getLastCellNum()-1;
	System.out.println(totalRows);
	System.out.println(totalColumns);
	String data[][] = new String[totalRows + 1][totalColumns + 1];
	for(int i=0;i<=totalRows; i++)	
	{
	 for(int j=0;j<=totalColumns;j++)
	 {
		String value = mySheet.getRow(i).getCell(j).getStringCellValue();
		
		data [i][j]=value;
	 }
	}
	  return data;
	
	  
	}
	
	public static String readDataFromProperties(String key) throws IOException
	  {
		String filepath = System.getProperty("user.dir")+"\\fbTest.properties";
		
		FileInputStream myFile=new FileInputStream(filepath);
		Properties prop=new Properties();
		prop.load(myFile);
		String value = prop.getProperty(key);
		System.out.println(value);
		return value;
	  }

  }


