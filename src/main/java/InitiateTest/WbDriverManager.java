package InitiateTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import Utils.PropertyFileManager;

public class WbDriverManager {
	
	public static WebDriver driver;
	private static final Logger LOGGER = LoggerFactory.getLogger(WbDriverManager.class);
	
	public static WebDriver getDriver() {
		if(PropertyFileManager.getProperties("config", "browser").equalsIgnoreCase("chrome")) {
			LOGGER.info("Launching Chrome Browser");
			System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\drivers\\chromedriver_windows.exe");
			driver = new ChromeDriver();
			setDriverProp();
			
	}
		return driver;
	}

	private static void setDriverProp() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	
}
