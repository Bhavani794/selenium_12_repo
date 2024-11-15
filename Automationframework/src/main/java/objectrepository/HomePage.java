package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
@FindBy(linkText = "Log out")
private WebElement logoutLink;
@FindBy(partialLinkText = "BOOKS")
private WebElement bookslink;
@FindBy(partialLinkText = "COMPUTERS")
private WebElement computerslinks;
@FindBy(partialLinkText = "ELECTRONICS")
private WebElement electronicslink;

public HomePage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public WebElement getLogOutLink() {
	return logoutLink;
	
	
}
public WebElement getLogoutLink() {
	return logoutLink;
}
public WebElement getBookslink() {
	return bookslink;
}
public WebElement getComputerslinks() {
	return computerslinks;
}
public WebElement getElectronicslink() {
	return electronicslink;
}
}
