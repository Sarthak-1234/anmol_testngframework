package Utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import InitiateTest.Init;

public class CommonMethods {
	
	public static JavascriptExecutor js;
	public static Actions act;
	
	
	public static void expicitWait_VisibilityOfElement(WebElement ele) {
		
		WebDriverWait wait = new WebDriverWait(Init.driver,50);
		wait.until(ExpectedConditions.visibilityOf(ele));
	}
	
	public static void expicitWait_alertIsPresent() {
		
		WebDriverWait wait = new WebDriverWait(Init.driver,50);
		wait.until(ExpectedConditions.alertIsPresent());
	}
	
	public static void javaScriptExe(String script) {
		js = (JavascriptExecutor) Init.driver;
		js.executeScript(script);
	}
	
	public static void javaScriptClickWithArguments(WebElement ele) {
		js = (JavascriptExecutor) Init.driver;
		js.executeScript("arguments[0].click()", ele);
	}
	
	public static void javaScriptTypeWithArguments(WebElement ele, String value) {
		js = (JavascriptExecutor) Init.driver;
		js.executeScript("arguments[0].value="+value+"", ele);
	}
	
	public static void mouseHover(WebElement ele) {
		act = new Actions(Init.driver);
		act.moveToElement(ele).build().perform();
	}
	
	public static void dragAndDrop(WebElement source, WebElement target) {
		act = new Actions(Init.driver);
		act.dragAndDrop(source, target).build().perform();
	}

}
