package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	public WebDriver driver;
	public Login(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="loginform-username")WebElement username;
	@FindBy(xpath = "//input[@type='password']")WebElement password;
	@FindBy(xpath = "//button[@type='submit']")WebElement login;
	@FindBy(xpath = "//a[text()='Clients']")WebElement home; 
	@FindBy(xpath="//h1[text()='Login']")WebElement insert;
	
	
	
	
	public void enterUsernameFields(String usernamefield) {
		username.sendKeys(usernamefield);
	}
	public void enterPassword(String passwordfield ) {
		password.sendKeys(passwordfield);
	}
	public void button() {
		login.click();
	}
	public boolean isHomePageIsLoaded() {
		//home.isDisplayed();
		return home.isDisplayed();  //checking home is displayed or not
		
	}
	public boolean isloginpageisloaded() {
		return insert.isDisplayed();
		
	}
}
	