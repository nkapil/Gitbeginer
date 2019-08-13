package pckg1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Car {

	@Test(groups= {"Smoke"})
	public void login() {
		// TODO Auto-generated method stub
		System.out.println("Car Login");

	}
	
	@BeforeSuite
	public void bfrSuit() {
		System.out.println("This is the Before suite inside Car");
	}
	
	@BeforeClass
	public void bfr1Suit() {
		System.out.println("This is the Before class inside Car");
	}
	
	@AfterClass
	public void aftr1Suit() {
		System.out.println("This is the after class inside Car");
	}
	
	@Test(dependsOnMethods= {"login"}, groups= {"Smoke"})
	public void homePage() {
		// TODO Auto-generated method stub
		System.out.println("Car Home Page");

	}
	
	@AfterSuite
	public void aftrSuit() {
		System.out.println("This is the After suite inside Car");
	}
	@Test (dependsOnMethods= {"homePage"})
	public void logout() {
		// TODO Auto-generated method stub
		System.out.println("Car Logout");

	}

}
