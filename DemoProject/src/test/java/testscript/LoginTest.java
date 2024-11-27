package testscript;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.Login;

public class LoginTest extends Launch {
  
  public void verifyThatTheUserIsAbleToLoginWithValidDetails() {
	 Login enter=new Login(driver);
	  enter.enterUsernameFields("carol");
	  enter.enterPassword("1q2w3e4r");  //1q2w3e4r
	  enter.button();
	  boolean homepageisloaded=enter.isHomePageIsLoaded();
	  Assert.assertTrue(homepageisloaded,"Invalid credentials");
	
  }
  @Test
  public void verifythattheuserisabletologinwithinvalidpassword() {
	  Login enter=new Login(driver);
	  enter.enterUsernameFields("carol");
	  enter.enterPassword("1q2w");  //1q2w3e4r
	  enter.button();
	 boolean loginpage=enter.isloginpageisloaded();
	 Assert.assertTrue(loginpage, "Ivalid Details");
  }
}
