package Books;

import java.io.IOException;
import java.sql.Driver;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import genericutility.BaseClass;
import objectrepository.HomePage;

public class TC_DWS_005_Test  extends BaseClass{
	@Test
public void ClickOnBooks() throws EncryptedDocumentException, IOException {
		hp= new HomePage(driver);
		hp.getBookslink().click();
		Assert.assertEquals(driver.getTitle(),eUtil.getStringDatafromExcel("Books",1,0),"Books page is not displayed");
		test.log(Status.PASS, "Books page is displayed");
		
	}	
}
