package rs.Itbootcamp.humanity.page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HumanityEditStaff {
	public static final String EDIT_STAFF_URL = "https://dasfsdcsa.humanity.com/app/staff/edit";
	private static final String EDIT_XPATH = "//a[contains(text(),'Edit Details')]";
	private static String UPLOAD_PICTURE_XPATH = "//input[@id='fileupload']";
	private static String NICKNAME_XPATH = "//input[@id='nick_name']";
	private static String SAVE_EMPL_XPATH = "//button[@id='act_primary']";
	private static String IMAGE_PATH = "C:/Users/Dusan/Downloads/slika1.jpg";

	// EDIT details button
	public static WebElement getEditBtn(WebDriver driver) {
		return driver.findElement(By.xpath(EDIT_XPATH));
	}

	public static void clickEditBtn(WebDriver driver) {
		getEditBtn(driver).click();
	}

	// Upload pictures button
	public static WebElement getUploadPicture(WebDriver driver) {
		return driver.findElement(By.xpath(UPLOAD_PICTURE_XPATH));
	}

	public static void clickUploadPicture(WebDriver driver) {
		getUploadPicture(driver).click();
	}

	public static void inputPhotoPath(WebDriver driver) {
		getUploadPicture(driver).sendKeys(IMAGE_PATH);
		
	}
	

	// Nickname button and input
	public static WebElement getNickname(WebDriver driver) {
		return driver.findElement(By.xpath(NICKNAME_XPATH));
	}

	public static void clickNickname(WebDriver driver) {
		getNickname(driver).click();
	}

	public static void inputNickname(WebDriver driver, String nickname) {
		getNickname(driver).sendKeys(nickname);
		;
	}

	// save employee button
	public static WebElement getSaveEmployee(WebDriver driver) {
		return driver.findElement(By.xpath(SAVE_EMPL_XPATH));
	}

	public static void clickSaveEmployee(WebDriver driver) {
		getSaveEmployee(driver).click();
	}

}
