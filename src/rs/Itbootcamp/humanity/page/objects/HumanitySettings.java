package rs.Itbootcamp.humanity.page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HumanitySettings {
	private static String COUNTRY_XPATH = "//select[@id='country']";
	private static String DEFAULT_LANGUAGE_XPATH = "//td[@class='nowrap']//select[@name='language']";
	private static String TIMEFORMAT_XPATH = "//select[@name='pref_24hr']";
	private static String SAVE_SETTINGS_XPATH = "//button[@id='act_primary']";

	// SelectState
	public static Select getCountry(WebDriver driver) {
		return new Select(driver.findElement(By.xpath(COUNTRY_XPATH)));
	}

	public static void inputCountry(WebDriver driver, String country) {
		getCountry(driver).selectByVisibleText(country);
	}

	// Default language
	public static Select getLanguage(WebDriver driver) {
		return new Select(driver.findElement(By.xpath(DEFAULT_LANGUAGE_XPATH)));
	}

	public static void inputLanguage(WebDriver driver, String language) {
		getLanguage(driver).selectByVisibleText(language);
	}

	// Time Format
	public static Select getTimeFormat(WebDriver driver) {
		return new Select(driver.findElement(By.xpath(TIMEFORMAT_XPATH)));
	}

	public static void inputTimeFormat(WebDriver driver, String format) {
		getTimeFormat(driver).selectByVisibleText(format);
	}

	// Save Settings
	public static WebElement getSaveSettings(WebDriver driver) {
		return driver.findElement(By.xpath(SAVE_SETTINGS_XPATH));
	}

	public static void clickSaveSettings(WebDriver driver) {
		getSaveSettings(driver).click();
	}

}
