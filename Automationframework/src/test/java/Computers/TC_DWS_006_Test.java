package Computers;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import genericutility.BaseClass;
import objectrepository.HomePage;

public class TC_DWS_006_Test extends BaseClass {
	@Test
	public void clickOnComputers() throws EncryptedDocumentException, IOException {
		hp= new HomePage(driver);
		hp.getComputerslinks().click();
		Assert.assertEquals(driver.getTitle(),eUtil.getStringDatafromExcel("COMPUTERS", 1, 0), "computers page is not displayed");
		test.log(Status.PASS, "computers page is displayed");
	}

}
