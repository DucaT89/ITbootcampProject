package rs.Itbootcamp.humanity.page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HumanityHome {
	public static final String HOME_URL = "https://www.humanity.com";
	public static final String LOGIN_URL = "https://www.humanity.com/app";

	private static String ABOUT_US_XPATH = "//a[@class='nav-link no-before'][contains(text(),'About us')]";
	private static String LOGIN_XPATH = "//p[contains(text(),'LOGIN')]";
	private static String LOGINUSER_XPATH = "//input[@id='email']";
	private static String LOGINPASS_XPATH = "//input[@id='password']";
	private static String LOGIN_BUTTON_XPATH = "//button[contains(text(),'Log in')]";

	private static String UPPER_START_FREE_TRIAL_XPATH = "//a[@class='button pale']";
	private static String HOME_FULLNAME_XPATH = "//div[@class='input-wrapper']//input[@placeholder='Full Name']";
	private static String HOME_EMAIL_XPATH = "//div[@class='input-wrapper']//input[@placeholder='Work Email']";
	private static String START_FREE_TRIAL_BUTTON_XPATH = "//input[@id='free-trial-link-01']";

	// public static WebElement getHomeUrl(WebDriver driver) {
	// return driver.findElement(HOME_URL);
	// }
	// get and click About Us
	public static WebElement getAboutUs(WebDriver driver) {
		return driver.findElement(By.xpath(ABOUT_US_XPATH));
	}

	public static void clickAboutUs(WebDriver driver) {
		getAboutUs(driver).click();
	}

	// get and click log in, then input
	public static WebElement getLogin(WebDriver driver) {
		return driver.findElement(By.xpath(LOGIN_XPATH));
	}

	public static void clickLogin(WebDriver driver) {
		getLogin(driver).click();
	}

	// on log in page https://www.humanity.com/app/
	public static WebElement getLoginUser(WebDriver driver) {
		return driver.findElement(By.xpath(LOGINUSER_XPATH));
	}

	public static void clickLoginUser(WebDriver driver) {
		getLoginUser(driver).click();
	}

	public static void inputLoginUser(WebDriver driver, String data) {
		getLoginUser(driver).sendKeys(data);
	}

	public static WebElement getLoginPass(WebDriver driver) {
		return driver.findElement(By.xpath(LOGINPASS_XPATH));
	}

	public static void clickLoginPass(WebDriver driver) {
		getLoginPass(driver).click();
	}

	public static void inputLoginPass(WebDriver driver, String data) {
		getLoginPass(driver).sendKeys(data);
	}

	public static WebElement getLoginButton(WebDriver driver) {
		return driver.findElement(By.xpath(LOGIN_BUTTON_XPATH));
	}

	public static void clickLoginButton(WebDriver driver) {
		getLoginButton(driver).click();
	}

	// get and click start free trial
	public static WebElement getStartTrial(WebDriver driver) {
		return driver.findElement(By.xpath(UPPER_START_FREE_TRIAL_XPATH));
	}

	public static void clickStartTrial(WebDriver driver) {
		getStartTrial(driver).click();
	}

	// get and click and input home page full name
	public static WebElement getHomeFullname(WebDriver driver) {
		return driver.findElement(By.xpath(HOME_FULLNAME_XPATH));
	}

	public static void clickHomeFullname(WebDriver driver) {
		getHomeFullname(driver).click();
	}

	public static void inputHomeFullname(WebDriver driver, String data) {
		getHomeFullname(driver).sendKeys(data);
		;
	}

	// get and click and input home page email
	public static WebElement getHomeEmail(WebDriver driver) {
		return driver.findElement(By.xpath(HOME_EMAIL_XPATH));
	}

	public static void clickHomeEmail(WebDriver driver) {
		getHomeEmail(driver).click();
	}

	public static void inputHomeEmail(WebDriver driver, String data) {
		getHomeEmail(driver).sendKeys(data);
		;
	}

	// get and click start free trial button HomePAge
	public static WebElement getStartTrialButton(WebDriver driver) {
		return driver.findElement(By.xpath(START_FREE_TRIAL_BUTTON_XPATH));
	}

	public static void clickStartTrialButton(WebDriver driver) {
		getStartTrialButton(driver).click();
	}

}
