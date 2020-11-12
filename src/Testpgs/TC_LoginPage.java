package Testpgs;

import Base.Basic;
import Pages.LoginPage_elements;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;

import Base.Data_driven_xl;

public class TC_LoginPage extends Basic {
	@Test
	public void ValidLogin()
		throws InterruptedException, EncryptedDocumentException, FileNotFoundException, IOException {
		LoginPage_elements lp = new LoginPage_elements(driver);
		String un = Data_driven_xl.getData(XL_PATH, ValidSheet, 1, 0);
		String pw = Data_driven_xl.getData(XL_PATH, ValidSheet, 1, 1);

		lp.enter_name(un);
		lp.enter_password(pw);
		lp.click_submit();
		
		String Window_title = driver.getTitle();
		Assert.assertEquals(Title_PostLogin, Window_title);
		Thread.sleep(2000);
	}
	
}