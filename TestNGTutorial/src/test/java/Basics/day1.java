package Basics;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day1 
{
	
	@AfterTest
	public void lastexecution()
	{
		System.out.println("I will execute last");
		
	}
	
	@Parameters({"URL"})
	@BeforeClass
	public void BC(String url)
	{
		System.out.println("Before class");
		System.out.println(url);
	}
	@AfterClass
	public void AC()
	{
		System.out.println("After class");
	}
	
	
	@AfterSuite
	public void Asuite()
	{
		System.out.println("After suite");
	}
	
	@Test(groups= {"smoke"})
	public void Demo()
	{
		System.out.println("hello");
	}
	
	@Test
	public void SecondTest()
	{
		System.out.println("Bye");
	}


}
