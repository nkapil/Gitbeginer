package pckg1;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class beginAuto {

	@Test
	public void autoMobile() {
		// TODO Auto-generated method stub
		System.out.println("Auto Generic");

	}
	
	@AfterTest
	public void aftTest() {
		// TODO Auto-generated method stub
		System.out.println("This is the after Test in begin Auto");

	}
	
	@BeforeTest
	public void bfrTest() {
		// TODO Auto-generated method stub
		System.out.println("This is the Before Test in begin Auto");

	}

}
