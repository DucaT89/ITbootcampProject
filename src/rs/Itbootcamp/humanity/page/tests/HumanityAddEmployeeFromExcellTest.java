package rs.Itbootcamp.humanity.page.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import rs.Itbootcamp.humanity.page.objects.HumanityHome;
import rs.Itbootcamp.humanity.page.objects.HumanityMenu;
import rs.Itbootcamp.humanity.page.objects.HumanityStaff;
import rs.Itbootcamp.humanity.utility.ExcelUtils;

public class HumanityAddEmployeeFromExcellTest {
	public static boolean TestAddEMPLOYEE() throws InterruptedException {
		ExcelUtils.setExcell("Data TABELE.xls");
		ExcelUtils.setWorkSheet(1);

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

			Thread.sleep(3000);
			if (!driver.getCurrentUrl().contains("https://beta4.humanity.com/app/dashboard/")) {
				System.out.println("neuspesan Login");
				return false;
			} else

				System.out.println("uspesan Login");

			HumanityMenu.clickStaff(driver);
			HumanityStaff.clickAddEmployee(driver);
			Thread.sleep(3000);

			// adding employee

			for (int i = 1; i < ExcelUtils.getRowNumber(); i++) {
				String name = ExcelUtils.getDataAt(i, 0);
				String lastname = ExcelUtils.getDataAt(i, 1);
				String email = ExcelUtils.getDataAt(i, 2);

				HumanityStaff.inputEmployeeName(driver, i, name);
				HumanityStaff.inputEmployeeLastname(driver, i, lastname);
				HumanityStaff.inputEmployeeEmail(driver, i, email);

			}
			HumanityStaff.clickSubmitEmployee(driver);

		} catch (Exception ex) {
			System.out.println(ex.toString());
		}
		driver.navigate().to("https://beta4.humanity.com/app/staff/list/load/true/");
		Thread.sleep(1500);

		if (!driver.getCurrentUrl().contains("https://beta4.humanity.com/app/staff/assign")) {
			System.out.println("neuspesao dodavanje");
			return false;
		} else

			System.out.println("Uspesno dodavanje");

		Thread.sleep(2000);
		driver.quit();

		return true;
	}
}
