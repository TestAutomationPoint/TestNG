package Basics;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day2 
{
	@Test(groups= {"smoke"})
	public void Demo()
	{
		System.out.println("In Test 2");
	}
	
	@Parameters({"URL"})
	@BeforeTest
	public void prerequisite(String url)
	{
		System.out.println("I will execute before all test execution");
		System.out.println(url);
	}



}
