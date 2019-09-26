package rs.Itbootcamp.humanity.page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HumanityStaff {
	public static final String HumanityStaff_URL = "vasafirma.humanity.com/app/staff/list/load/true/";
	private static String ADD_EMPLOYEE_XPATH = "//button[@id='act_primary']";
	private static String STAFF_VIEW_XPATH = "//div[@id='staffviewchange_']//div[contains(@class,'last tti')]";

	private static String EMPLOYEE_NAME_XPATH = "//a[contains(text(),'";
	private static String ENDING_XPATH = "')]";
	
	//input employee
	private static String INPUT_EMPLOYEE_NAME_XPATH = "//input[@id='_asf";
	private static String INPUT_EMPLOYEE_LASTNAME_XPATH = "//input[@id='_asl";
	private static String INPUT_EMPLOYEE_EMAIL_XPATH = "//input[@id='_ase";
	// + i +
	private static String INPUT_ENDING_XPATHS = "']";
	
	private static String SAVE_EMPLOYEE_XPATH = "//button[@id='_as_save_multiple']";
	
	// Add employee
	public static WebElement getAddEmployee(WebDriver driver) {
		return driver.findElement(By.xpath(ADD_EMPLOYEE_XPATH));
	}

	public static void clickAddEmployee(WebDriver driver) {
		getAddEmployee(driver).click();
	}
//	staff view button
	public static WebElement getStaffViewBtn(WebDriver driver) {
		return driver.findElement(By.xpath(STAFF_VIEW_XPATH));
	}
	public static void clickStaffViewBtn(WebDriver driver) {
		getStaffViewBtn(driver).click();
	}

//	get Employee by name
	public static WebElement getEmployeeByName(WebDriver driver, String name) {
		return driver.findElement(By.xpath(EMPLOYEE_NAME_XPATH+name+ENDING_XPATH));
	}
	public static void clickEmployeeByName(WebDriver driver, String name) {
		getEmployeeByName(driver, name).click();
	
	}

	// input employee first name
	public static WebElement getEnterEmployeeName(WebDriver driver,int i) {
		return driver.findElement(By.xpath(INPUT_EMPLOYEE_NAME_XPATH+i+INPUT_ENDING_XPATHS));
	}

	public static void clickEnterEmployeeName(WebDriver driver,int i) {
		getEnterEmployeeName(driver,i).click();
	}

	public static void inputEmployeeName(WebDriver driver,int i, String name) {
		getEnterEmployeeName(driver,i).sendKeys(name);
	}

	// input employee last name
	public static WebElement getEnterEmployeeLastame(WebDriver driver,int i) {
		return driver.findElement(By.xpath(INPUT_EMPLOYEE_LASTNAME_XPATH+i+INPUT_ENDING_XPATHS));
	}

	public static void clickEnterEmployeeLastame(WebDriver driver,int i) {
		getEnterEmployeeLastame(driver,i).click();
	}

	public static void inputEmployeeLastname(WebDriver driver,int i, String lastname) {
		getEnterEmployeeLastame(driver,i).sendKeys(lastname);
	}

	// input employee email
	public static WebElement getEnterEmployeeEmail(WebDriver driver,int i) {
		return driver.findElement(By.xpath(INPUT_EMPLOYEE_EMAIL_XPATH+i+INPUT_ENDING_XPATHS));
	}

	public static void clickEnterEmployeeEmail(WebDriver driver,int i) {
		getEnterEmployeeEmail(driver,i).click();
	}

	public static void inputEmployeeEmail(WebDriver driver,int i, String email) {
		getEnterEmployeeEmail(driver,i).sendKeys(email);
	}

	// Submit Employees
	public static WebElement getSubmitEmployee(WebDriver driver) {
		return driver.findElement(By.xpath(SAVE_EMPLOYEE_XPATH));
	}

	public static void clickSubmitEmployee(WebDriver driver) {
		getSubmitEmployee(driver).click();
	}

}
