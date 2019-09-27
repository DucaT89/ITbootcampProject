package rs.Itbootcamp.humanity.page.tests;

import java.io.File;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import rs.Itbootcamp.humanity.page.objects.HumanityHome;
import rs.Itbootcamp.humanity.page.objects.HumanityMenu;
import rs.Itbootcamp.humanity.utility.ExcelUtils;

public class HumanityLoginTestExcell {

	public static boolean loggingSuccessful() {

		ExcelUtils.setExcell("Data TABELE.xls");
		ExcelUtils.setWorkSheet(0);

		String loginEmail = ExcelUtils.getDataAt(1, 0);
		String password = ExcelUtils.getDataAt(1, 1);
		boolean successful = false;

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		try {
			driver.get(HumanityHome.HOME_URL);
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			HumanityHome.clickLogin(driver);
			Thread.sleep(2000);
			HumanityHome.inputLoginUser(driver, loginEmail);
			HumanityHome.inputLoginPass(driver, password);
			HumanityHome.clickLoginButton(driver);

			Thread.sleep(3000);
			System.out.println(driver.getCurrentUrl());

			if (Objects.equals(driver.getCurrentUrl(), HumanityMenu.HumanityMenu_URL)) {
				successful = true;
			} else {
				successful = false;
			}
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		driver.quit();

		if (successful = true) {
			System.out.println("Login test: PASSED");
		} else {
			System.out.println("Login test: FAILED");
		}

		return successful;
	}
}