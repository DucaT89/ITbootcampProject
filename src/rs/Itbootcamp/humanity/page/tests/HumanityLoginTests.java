package rs.Itbootcamp.humanity.page.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import rs.Itbootcamp.humanity.page.objects.HumanityHome;
import rs.Itbootcamp.humanity.page.objects.HumanityMenu;

public class HumanityLoginTests {

	public static boolean Test1() throws InterruptedException {
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

		}

		catch (Exception ex) {
			System.out.println(ex.toString());
		}
		Thread.sleep(4000);
		driver.quit();
		return true;

	}

}
