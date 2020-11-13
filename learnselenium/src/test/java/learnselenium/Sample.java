package learnselenium;

import org.testng.annotations.Test;

public class Sample 
{
	@Test(description="FirstMethod",priority=1)
	public void z()
	{
		System.out.println("z in room");
		
	}
	@Test(description="SecondMethod",priority=0)
	public void y()
	{
		System.out.println("y in room");
		
	}
	@Test(description="ThirdMethod",priority=2)
	public void x()
	{
		System.out.println("x in room");
		
	}
	

}
