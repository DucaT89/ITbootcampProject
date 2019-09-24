package rs.Itbootcamp.humanity.page.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import rs.Itbootcamp.humanity.page.objects.HumanityEditStaff;
import rs.Itbootcamp.humanity.page.objects.HumanityHome;
import rs.Itbootcamp.humanity.page.objects.HumanityMenu;
import rs.Itbootcamp.humanity.page.objects.HumanityProfile;

public class HumanityEditStaffTest {
	
	public static boolean Test3() throws InterruptedException {
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
			HumanityProfile.getSettingsButton(driver);
			HumanityProfile.clickSettingsButton(driver);
			Thread.sleep(2000);
			HumanityEditStaff.getUploadPicture(driver);
		   
			HumanityEditStaff.inputPhotoPath(driver);
			Thread.sleep(2500);
			HumanityEditStaff.getNickname(driver);
			HumanityEditStaff.clickNickname(driver);
			HumanityEditStaff.inputNickname(driver, "perica");
			
			HumanityEditStaff.getSaveEmployee(driver);
			HumanityEditStaff.clickSaveEmployee(driver);

			
		}catch (Exception ex) {
			System.out.println(ex.toString());
		}
		System.out.println("edits complited");
		Thread.sleep(4000);
		driver.quit();
		return true;
	}
}
