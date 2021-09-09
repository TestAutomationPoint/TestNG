package Basics;

import org.testng.annotations.Test;

public class day4 
{
	@Test(dependsOnMethods= {"Homeapilogin"})
	public void Homelogin()
	{
		System.out.println("In Homeweblogin");
	}
	
	@Test(enabled=false)
	public void Homemobilelogin()
	{
		System.out.println("In Homemobilelogin");
	}
	
	@Test(timeOut=4000)
	public void Homeapilogin()
	{
		System.out.println("In Homeapilogin");
	}



}
