package rs.Itbootcamp.humanity.page.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import rs.Itbootcamp.humanity.page.objects.HumanityHome;
import rs.Itbootcamp.humanity.page.objects.HumanityMenu;
import rs.Itbootcamp.humanity.page.objects.HumanityProfile;
import rs.Itbootcamp.humanity.page.objects.HumanitySettings;

public class HumanitySettingsTest {

	public static boolean Test4() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		try {
			driver.get(HumanityHome.HOME_URL);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

			HumanityHome.clickLogin(driver);
			HumanityHome.clickLoginUser(driver);
			HumanityHome.inputLoginUser(driver, "supsohemli@enayu.com");
			HumanityHome.clickLoginPass(driver);
			HumanityHome.inputLoginPass(driver, "Zvezdara");
			HumanityHome.clickLoginButton(driver);

			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			Thread.sleep(3000);
			if (!driver.getCurrentUrl().equals("https://beta4.humanity.com/app/dashboard/")) {
				System.out.println("neuspesan Login");
				return false;
			} else
				System.out.println("uspesan Login");
			Thread.sleep(4000);
			
			HumanityMenu.getSettings(driver);
			HumanityMenu.clickSettings(driver);
			
			Thread.sleep(2000);

			HumanitySettings.getCountry(driver);
			HumanitySettings.inputCountry(driver, "Serbia");
			HumanitySettings.getLanguage(driver);
			HumanitySettings.inputLanguage(driver, "American English");
			HumanitySettings.getTimeFormat(driver);
			HumanitySettings.inputTimeFormat(driver, "24 hour");
			
			HumanitySettings.clickSaveSettings(driver);
			Thread.sleep(3000);

		}
		catch (Exception ex) {
			System.out.println(ex.toString());
		}
		System.out.println("Succesfull settings");
		Thread.sleep(4000);
		driver.quit();
		return true;

	
	}
}
