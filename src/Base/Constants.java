package Base;

public interface Constants {
	String GC_KEY= "webdriver.chrome.driver";
	String GC_PATH= "./driver/chromedriver.exe";
	String FF_KEY= "webdriver.gecko.driver";
	String FF_PATH= "./driver/geckodriver.exe";
	String url= "https://auth.testproject.io/auth/realms/TP/protocol/openid-connect/auth?client_id=tp.app&redirect_uri=https%3A%2F%2Fapp.testproject.io%2Fcallback.html&response_type=id_token%20token&scope=openid%20profile&state=27b8444075814b1caffc2b3e4cab2eff&nonce=d92257bc49c74885bab1cda4da0351db";
	String SS_PATH= "./ScreenShots/";
	String XL_PATH= "./excel_data/UN_PS.xlsx";
	String ValidSheet = "Valid";
	String InValidSheet = "Invalid";
	String Title_PostLogin = "TestProject";
	
	String ERROR_MSG_BROWSER="Browser not valid";

}
