package rs.Itbootcamp.humanity.page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HumanityMenu {

	public static final String HumanityMenu_URL = "vasafirma.humanity.com/app/dashboard";
	private static String DASHBOARD_XPATH = "//a[@id='sn_dashboard']//span[@class='primNavQtip__inner']";
	private static String SHIFT_PLANNING_XPATH = "//i[@class='primNavQtip__icon icon-shiftPlanning']";
	private static String TIME_CLOCK_XPATH = "//a[@id='sn_timeclock']//span[@class='primNavQtip__inner']";
	private static String LEAVE_XPATH = "//i[@class='primNavQtip__icon icon-leave2']";
	private static String TRAINING_XPATH = "//a[@id='sn_training']//span[@class='primNavQtip__inner']";
	private static String STAFF_XPATH = "//a[@id='sn_staff']//span[@class='primNavQtip__inner']";
	private static String PAYROLL_XPATH = "//a[@id='sn_payroll']//span[@class='primNavQtip__inner']";
	private static String REPORTS_XPATH = "//a[@id='sn_reports']//span[@class='primNavQtip__inner']";

	// get and click Dashboard
	public static WebElement getDashboard(WebDriver driver) {
		return driver.findElement(By.xpath(DASHBOARD_XPATH));
	}

	public static void clickAboutUs(WebDriver driver) {
		getDashboard(driver).click();
	}

	// get and click ShiftPlanning
	public static WebElement getShiftPlanning(WebDriver driver) {
		return driver.findElement(By.xpath(SHIFT_PLANNING_XPATH));
	}

	public static void clickShiftPlanning(WebDriver driver) {
		getShiftPlanning(driver).click();
	}

	// get and click time clock
	public static WebElement getTimeClock(WebDriver driver) {
		return driver.findElement(By.xpath(TIME_CLOCK_XPATH));
	}

	public static void clickTimeCLock(WebDriver driver) {
		getTimeClock(driver).click();
	}

	// get and click Leave
	public static WebElement getLeave(WebDriver driver) {
		return driver.findElement(By.xpath(LEAVE_XPATH));
	}

	public static void clickLeave(WebDriver driver) {
		getLeave(driver).click();
	}

	// get and click Training
	public static WebElement getTraining(WebDriver driver) {
		return driver.findElement(By.xpath(TRAINING_XPATH));
	}

	public static void clickTraining(WebDriver driver) {
		getTraining(driver).click();
	}

	// get and click Staff
	public static WebElement getStaff(WebDriver driver) {
		return driver.findElement(By.xpath(STAFF_XPATH));
	}

	public static void clickStaff(WebDriver driver) {
		getStaff(driver).click();
	}

	// get and click PAyroll
	public static WebElement getPayroll(WebDriver driver) {
		return driver.findElement(By.xpath(PAYROLL_XPATH));
	}

	public static void clickPayroll(WebDriver driver) {
		getPayroll(driver).click();
	}

	// get and click Reports
	public static WebElement getReports(WebDriver driver) {
		return driver.findElement(By.xpath(REPORTS_XPATH));
	}

	public static void clickReports(WebDriver driver) {
		getReports(driver).click();
	}

}
