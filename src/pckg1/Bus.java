package pckg1;

import org.testng.annotations.Test;

public class Bus {

	@Test
	public void login() {
		// TODO Auto-generated method stub
		System.out.println("Bus Login");

	}
	@Test(groups= {"Smoke"})
	public void homePage() {
		// TODO Auto-generated method stub
		System.out.println("Bus Home Page");

	}
	@Test
	public void logout() {
		// TODO Auto-generated method stub
		System.out.println("Bus Logout");

	}

}
