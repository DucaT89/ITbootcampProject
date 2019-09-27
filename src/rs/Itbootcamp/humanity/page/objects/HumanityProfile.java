package rs.Itbootcamp.humanity.page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HumanityProfile {
	private static final String AVATAR_XPATH = "//img[@id='tr_avatar']";
	private static String PROFILE_BTN_XPATH = "//a[contains(text(),'Profile')]";
	private static String SETTINGS_BTN_XPATH = "//div[@class='userm userm-mainPage']//a[contains(text(),'Settings')]";
	private static String AVAILABILITY_XPATH = "//div[@class='userm userm-mainPage']//a[contains(text(),'Availability')]";
	private static String SIGNOUT_BTN_XPATH = "//a[contains(text(),'Sign Out')]";
	private static String App_Version_num = "9.5.5";

	// Profile picture
	public static WebElement getAvatar(WebDriver driver) {
		return driver.findElement(By.xpath(AVATAR_XPATH));
	}

	public static void clickAvatar(WebDriver driver) {
		getAvatar(driver).click();
	}

	// Profile button from ddm
	public static WebElement getProfileButton(WebDriver driver) {
		return driver.findElement(By.xpath(PROFILE_BTN_XPATH));
	}

	public static void clickProfileButton(WebDriver driver) {
		getProfileButton(driver).click();
	}

	// Settings button from ddm
	public static WebElement getSettingsButton(WebDriver driver) {
		return driver.findElement(By.xpath(SETTINGS_BTN_XPATH));
	}

	public static void clickSettingsButton(WebDriver driver) {
		getSettingsButton(driver).click();
	}

	// Availability button from ddm
	public static WebElement getAvailabilityButton(WebDriver driver) {
		return driver.findElement(By.xpath(AVAILABILITY_XPATH));
	}

	public static void clickAvailabilityButton(WebDriver driver) {
		getAvailabilityButton(driver).click();
	}

	// SignOut button from ddm
	public static WebElement getSignOutButton(WebDriver driver) {
		return driver.findElement(By.xpath(SIGNOUT_BTN_XPATH));
	}

	public static void clickSignOutButton(WebDriver driver) {
		getSignOutButton(driver).click();
	}

	// Version
	public static void getVersion(WebDriver driver) {
		System.out.println(App_Version_num);
	}

}
