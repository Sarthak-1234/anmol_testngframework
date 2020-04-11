package Utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileManager {
	
	public static FileInputStream fis;
	public static Properties prop;
	public static String filename= "src\\main\\resources\\propertyFiles\\";
	
	public static String getProperties(String propFilename, String property) {
		try {
			fis = new FileInputStream(filename+propFilename+".properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		prop = new Properties();
		try {
			prop.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return prop.getProperty(property);
	}

}
