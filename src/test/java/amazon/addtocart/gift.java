package amazon.addtocart;

import org.testng.annotations.Test;
import org.testng.internal.annotations.IListeners;
import org.testng.annotations.Test;
import org.testng.ITestNGListener;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class gift {

	@Test(groups = {"Smoke"})
	public void demo()
	{
		System.out.println("hi");
		}
	
	/*@Test(dependsOnMethods = {"Maruti"})
	public void aemo1()
	{
		System.out.println("2nd");
		}*/
	
	@BeforeSuite
	public void bfsuite()
	{
		System.out.println("I am no 1 ");
		}
	
	@AfterSuite
	public void Afsuite()
	{
		System.out.println("I will print at last");
		}


	


}
