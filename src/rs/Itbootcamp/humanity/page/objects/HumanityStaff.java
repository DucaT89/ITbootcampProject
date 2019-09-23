package rs.Itbootcamp.humanity.page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HumanityStaff {
	public static final String HumanityStaff_URL = "vasafirma.humanity.com/app/staff/list/load/true/";
	private static String ADD_EMPLOYEE_XPATH = "//button[@id='act_primary']";
	private static String EMPLOYEE_NAME_XPATH = "//a[contains(text(),'";
	private static String kraj = "')]";
	
	private static String INPUT_EMPLOYEE_NAME_XPATH = "//input[@id='_asf1']";
	private static String INPUT_EMPLOYEE_LASTNAME_XPATH = "//input[@id='_asl1']";
	private static String INPUT_EMPLOYEE_EMAIL_XPATH = "//input[@id='_ase1']";
	private static String SAVE_EMPLOYEE_XPATH = "//button[@id='_as_save_multiple']";

	private static String IME_PREZIME(WebDriver driver) {
	 return HumanityStaff.getEnterEmployeeName(driver)+" "+HumanityStaff.getEnterEmployeeLastame(driver);}
		//String name,lastname;
		//return name+" "+lastname;}
	
	// Add employee
	public static WebElement getAddEmployee(WebDriver driver) {
		return driver.findElement(By.xpath(ADD_EMPLOYEE_XPATH));
	}

	public static void clickAddEmployee(WebDriver driver) {
		getAddEmployee(driver).click();
	}

	// get employee name 1
	public static WebElement getEmployeeName(WebDriver driver) {
		return driver.findElement(By.xpath(EMPLOYEE_NAME_XPATH+HumanityStaff.IME_PREZIME(driver)+HumanityStaff.kraj));
	}

	public static void clickEmployeeName(WebDriver driver) {
		getEmployeeName(driver).click();
	}


	// input employee first name
	public static WebElement getEnterEmployeeName(WebDriver driver) {
		return driver.findElement(By.xpath(INPUT_EMPLOYEE_NAME_XPATH));
	}

	public static void clickEnterEmployeeName(WebDriver driver) {
		getEnterEmployeeName(driver).click();
	}

	public static void inputEmployeeName(WebDriver driver, String name) {
		getEnterEmployeeName(driver).sendKeys(name);
	}

	// input employee last name
	public static WebElement getEnterEmployeeLastame(WebDriver driver) {
		return driver.findElement(By.xpath(INPUT_EMPLOYEE_LASTNAME_XPATH));
	}

	public static void clickEnterEmployeeLastame(WebDriver driver) {
		getEnterEmployeeLastame(driver).click();
	}

	public static void inputEmployeeLastname(WebDriver driver, String lastname) {
		getEnterEmployeeLastame(driver).sendKeys(lastname);
	}

	// input employee email
	public static WebElement getEnterEmployeeEmail(WebDriver driver) {
		return driver.findElement(By.xpath(INPUT_EMPLOYEE_EMAIL_XPATH));
	}

	public static void clickEnterEmployeeEmail(WebDriver driver) {
		getEnterEmployeeEmail(driver).click();
	}

	public static void inputEmployeeEmail(WebDriver driver, String email) {
		getEnterEmployeeEmail(driver).sendKeys(email);
	}

	// Submit Employees
	public static WebElement getSubmitEmployee(WebDriver driver) {
		return driver.findElement(By.xpath(SAVE_EMPLOYEE_XPATH));
	}

	public static void clickSubmitEmployee(WebDriver driver) {
		getSubmitEmployee(driver).click();
	}

}
