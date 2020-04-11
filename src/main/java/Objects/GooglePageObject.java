package Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GooglePageObject {
	
	public WebDriver driver;
	private static final Logger LOGGER = LoggerFactory.getLogger(GooglePageObject.class);
	
	public GooglePageObject(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="")
	WebElement ele;
	
	
	//Locators
	
	public String getTitle() {
		LOGGER.info("I am in getTitle method of GooglePageObject class");
		return driver.getTitle();
	}
	
	

}
