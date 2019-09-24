package rs.Itbootcamp.humanity.page.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import rs.Itbootcamp.humanity.page.objects.HumanityHome;
import rs.Itbootcamp.humanity.page.objects.HumanityMenu;
import rs.Itbootcamp.humanity.page.objects.HumanityProfile;

public class HumanityProfileSIgnOutTest {
	public static boolean Test5() throws InterruptedException {
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

			HumanityMenu.clickAvatar(driver);
			HumanityProfile.clickSignOutButton(driver);
			Thread.sleep(2000);

		} catch (Exception ex) {
			System.out.println(ex.toString());
		}

		if (!driver.getCurrentUrl().contains("https://beta4.humanity.com/app/")) {
			System.out.println("greska");
		} else
			System.out.println("You signed-out");

		Thread.sleep(4000);
		driver.quit();
		return true;

	}
}