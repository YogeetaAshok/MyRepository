package UtilityPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;

public class Utility3 {

	public static String readDataFromExcel(String filePath, String sheetName, int rowNum, int cellNum)throws EncryptedDocumentException, IOException {
			FileInputStream myFile = new FileInputStream(filePath);
			String value =WorkbookFactory.create(myFile).getSheet(sheetName).getRow(rowNum).getCell(cellNum).getStringCellValue();

			return value;
			}
	
       public static void takeScreenShot(WebDriver driver, String fileName) throws IOException {
		
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		Reporter.log("taking screenShot", true);
		String dateStamp= new SimpleDateFormat("YYYMMddHHmmss").format(new Date()); 
		File dest = new File(System.getProperty("user.dir")+"\\Screenshots\\"+fileName+ dateStamp+".png");
		FileHandler.copy(src,dest);
		FileHandler.copy(src, dest);
		Reporter.log("saving file at location "+dest, true);
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
