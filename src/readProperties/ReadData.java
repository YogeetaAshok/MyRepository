package readProperties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadData {

	public static String main(String Key) throws IOException {
		// TODO Auto-generated method stub

		String filepath = System.getProperty("user.dir")+"\\fbTest.properties";
		System.out.println(filepath);
		FileInputStream myFile=new FileInputStream(filepath);
		Properties prop=new Properties();
		prop.load(myFile);
		String value = prop.getProperty(Key);
		System.out.println(value);
		return value;
		
	}
}
