package expath;

import org.testng.annotations.Test;

public class Ps01 {

	@Test
	public void mul()
	{
		int a =3;
		Ps3 ps = new Ps3(3);
		ps.mul();
		System.out.println(ps.mul());
		
	}

}
