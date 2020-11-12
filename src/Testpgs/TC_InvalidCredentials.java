package Testpgs;

import org.testng.annotations.Test;

import Base.Basic;
import Base.Data_driven_xl;
import Pages.LoginPage_elements;

public class TC_InvalidCredentials extends Basic {

	@Test
	public void InValidLogin() throws InterruptedException {

		int rc = Data_driven_xl.getRowCount(XL_PATH, InValidSheet);
		System.out.println(rc);
		for (int i = 1; i <= rc; i++) {
			String un = Data_driven_xl.getData(XL_PATH, InValidSheet, i, 0);
			String pw = Data_driven_xl.getData(XL_PATH, InValidSheet, i, 1);
			
			LoginPage_elements lp = new LoginPage_elements(driver);

			lp.enter_name(un);
			lp.enter_password(pw);
			lp.click_submit();
			Thread.sleep(2000);
			lp.clear_data();

		}
		driver.navigate().to(url);

	}

}
