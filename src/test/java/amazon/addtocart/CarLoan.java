package amazon.addtocart;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CarLoan {

	@Test(enabled=false)
	public void Maruti()
	{
		System.out.println("Maruti2nd");
		}
	
	@BeforeMethod
	public void bfmethod()
	{
		System.out.println("I will execute in carloan in every method");
		}
	
	@AfterMethod
	public void afmethod()
	{
		System.out.println("I will execute in carloan in every after every method");
		}
	
	@Test(groups = {"Smoke"})
	public void lamborgeni()
	{
		System.out.println("lamborgeni2nd");
		}
	
	@Test
	public void Toyoto()
	{
		System.out.println("Toyoto2nd");
		}

}
