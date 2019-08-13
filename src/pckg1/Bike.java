package pckg1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Bike {

	@Test
	public void login() {
		// TODO Auto-generated method stub
		System.out.println("Bike Login");

	}
	@Test(groups= {"Smoke"})
	public void homePage() {
		// TODO Auto-generated method stub
		System.out.println("Bike Home Page");

	}
	@Test
	public void logout() {
		// TODO Auto-generated method stub
		System.out.println("Bike Logout");

	}
	
	@AfterMethod
	public void aftrMeth() {
		System.out.println("After method in Bike");
	}
	
	@BeforeMethod
	public void bfrMeth() {
		System.out.println("Before method in Bike");
	}
	
	

}
