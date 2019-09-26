package rs.Itbootcamp.humanity.start;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import rs.Itbootcamp.humanity.page.objects.HumanityStaff;
import rs.Itbootcamp.humanity.page.tests.HumanityAddEmployeeFromExcellTest;
import rs.Itbootcamp.humanity.page.tests.HumanityAddNewEmployeeTests;
import rs.Itbootcamp.humanity.page.tests.HumanityEditStaffTest;
import rs.Itbootcamp.humanity.page.tests.HumanityLoginTestExcell;
import rs.Itbootcamp.humanity.page.tests.HumanityLoginTests;
import rs.Itbootcamp.humanity.page.tests.HumanityProfileSIgnOutTest;
import rs.Itbootcamp.humanity.page.tests.HumanitySettingsTest;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Welcome to testing of page Humanity");
		Scanner sc = new Scanner(System.in);
	     int choise;
	do {
		System.out.println("Choose the test, by number, that you would like to run:");
		System.out.println("0 - Exit from testing\n");
		System.out.println("1 -HumanityLoginTests\n");
		System.out.println("2 - HumanityLoginTestExcell\n");
		System.out.println("3 - HumanityEditStaffTest\n");
		System.out.println("4 - HumanitySettingsTest\n");
		System.out.println("5 - HumanityProfileSIgnOutTest\n");
		System.out.println("6 - HumanityAddNewEmployeeTests\n");
		System.out.println("7 - HumanityAddEmployeeFromExcellTest\n");

		choise = sc.nextInt();
		switch (choise) {
		case 1:
			System.out.println("LOGIN TEST IS STARTING");
			HumanityLoginTests.Test1();
			break;
		case 2:
			System.out.println("LOGIN TEST with EXCELL IS STARTING");
			HumanityLoginTestExcell.loggingSuccessful();
			break;
		case 3:
			System.out.println("EDIT STAFF TEST IS STARTING");
		    HumanityEditStaffTest.Test3();
			break;
		case 4:
				System.out.println("SETTINGS TEST IS STARTING");
				HumanitySettingsTest.Test4();
			break;
		case 5:
			System.out.println("SIGN OUT TEST IS STARTING");
			HumanityProfileSIgnOutTest.Test5();
			
		break;
		case 6:
			System.out.println("ADD EMLOYEE TEST IS STARTING");
			HumanityAddNewEmployeeTests.Test5();
		break;
		case 7:
			System.out.println("SETTINGS TEST IS STARTING");
			HumanityAddEmployeeFromExcellTest.TestAddEMPLOYEE();
		break;
			
		default:
			System.out.println("BAD ENTRY,TRY AGAIN");
			
			break;
		case 0:
			System.out.println("YOU HAVE LEFT THE TESTING APP");
			break;
		}
	} while (choise != 0);

		//HumanityAddNewEmployeeTests.Test2();
		//HumanitySettingsTest.Test1();
		//HumanityEditStaffTest.Test3();
		//HumanityLoginTestExcell.loggingSuccessful();
		//HumanityAddEmployeeFromExcellTest.TestAddEMPLOYEE();
			System.out.println("END OF TESTING");	
	}
  
}
