package genericutility;

import java.awt.Window;
import java.sql.Driver;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebDriverUtility {
 public Dimension  getsize(WebDriver driver) {
	 return  driver.manage().window().getSize();
	 /**
	  * This method is used to  switch driver control to window based on url
	  * @param driver
	  * @param url
	  */
	 
 }
 public void switchToWindow(WebDriver driver,String url) {
	 //step 1: capture window ids
	 Set<String> allWindowIds = driver.getWindowHandles();
	 //step 2: navigate through all the windows
	 for(String id:allWindowIds) {
		 driver.switchTo().window(id);
		String acturl = driver.getCurrentUrl();
		if(acturl.contains(url)) {
			break;
		}
	 }
 }
 /**
  * This method is used to perform right click
  * @param driver
  */
 public void rightClick(WebDriver driver) {
	 Actions act =new Actions(driver);
	 act.contextClick().perform();
 }
 public void clickAndHold(WebDriver driver,WebElement element) {
	 Actions act = new Actions(driver);
	 act.clickAndHold(element).perform();
 }
 public void mouseHover(WebDriver driver ,WebElement element) {
	 Actions act = new Actions(driver);
	 act.moveToElement(element).perform();
 }
 public void mouseHover(WebDriver driver ,int x,int y) {
	 Actions act = new Actions(driver);
	 act.moveByOffset(x, y).perform();
 }
 public void dragAndDrop(WebDriver driver,WebElement element) {
	 Actions act = new Actions(driver);
	 act.dragAndDrop(element, element).perform();
 }
 public void switchToFrame(WebDriver driver,int index) {
	 driver.switchTo().frame(index);
 }
 public void switchToFrame(WebDriver driver ,String nameorId) {
	 driver.switchTo().frame(nameorId);
	 }
 public void switchToFrame(WebDriver driver,WebElement frameelement) {
	 driver.switchTo().frame(frameelement);
 }
 public void selectDropDownByIndex(WebElement element,int index) {
	 Select sel= new Select(element);
	 sel.selectByIndex(index);
 }
 public void switchBackMainPage(WebDriver driver) {
	 driver.switchTo().defaultContent();
	 }
public void selectDropDownByValue(WebElement element, String value) {
	Select sel = new Select(element);
	sel.selectByValue(value);
}
public void selectDropDownByVisibleText(WebElement element,String text) {
	Select sel=new Select(element);
	sel.selectByVisibleText(text);
}
public Alert switchtoAlert(WebDriver driver) {
	 return driver.switchTo().alert();
}
public void switchToAlertAndAccept(WebDriver driver) {
	driver.switchTo().alert().accept();
}
public void switchToAlertAndAcceptAndDismiss(WebDriver driver) {
	driver.switchTo().alert().dismiss();
}
public void switchToAlertAndSendKeys(WebDriver driver,String data) {
	driver.switchTo().alert().sendKeys(data);
}
public void jsScroll(WebDriver driver,int x,int y) {
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("Window.scrollBy, "+x+","+y+")");
	
	}
public void maximizeWindow(WebDriver driver) {
driver.manage().window().maximize();	
}
}