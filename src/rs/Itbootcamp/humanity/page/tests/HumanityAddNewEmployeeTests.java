package rs.Itbootcamp.humanity.page.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import rs.Itbootcamp.humanity.page.objects.HumanityHome;
import rs.Itbootcamp.humanity.page.objects.HumanityMenu;
import rs.Itbootcamp.humanity.page.objects.HumanityStaff;

public class HumanityAddNewEmployeeTests {

	public static boolean Test2() throws InterruptedException {
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
			if (!driver.getCurrentUrl().equals("https://beta4.humanity.com/app/dashboard/")) {
				System.out.println("neuspesan Login");
				return false;
			} else
				System.out.println("uspesan Login");

			HumanityMenu.clickStaff(driver);

			Thread.sleep(3000);

			if (!driver.getCurrentUrl().contains("https://beta4.humanity.com/app/staff/list/load/true/")) {
				System.out.println("neuspesan staff click");
				return false;
			} else
				System.out.println("na staff stranici smo");

			// adding employee
			
			
			HumanityStaff.clickAddEmployee(driver);
			HumanityStaff.clickEnterEmployeeName(driver);
			HumanityStaff.inputEmployeeName(driver, "joca");
			HumanityStaff.clickEnterEmployeeLastame(driver);
			HumanityStaff.inputEmployeeLastname(driver, "Jocic");
			HumanityStaff.clickEnterEmployeeEmail(driver);
			HumanityStaff.inputEmployeeEmail(driver, "joca123456@gmail.com");

			HumanityStaff.clickSubmitEmployee(driver);

		} catch (Exception ex) {
			System.out.println(ex.toString());
		}
		driver.navigate().to("https://beta4.humanity.com/app/staff/list/load/true/");
		Thread.sleep(1500);
		//String s="joca"+" "+"Jocic";
		//if(HumanityStaff.getEmployeeName(driver).equals(s));
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