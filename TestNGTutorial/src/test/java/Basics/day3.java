package Basics;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day3 
{
	@Test
	public void Carweblogin()
	{
		System.out.println("In Carweblogin");
	}
	
	@Test
	public void mobilelogin()
	{
		System.out.println("In Carmobilelogin");
	}
	
	@Parameters({"URL"})
	@Test
	public void mobilesigninlogin(String url)
	{
		System.out.println("In Carmobilelogin");
		System.out.println(url);
	}
	
	@BeforeMethod
	public void BM()
	{
		System.out.println("Before method");
	}
	
	@AfterMethod
	public void AM()
	{
		System.out.println("After method");
	}
	
	@BeforeSuite
	public void Bsuite()
	{
		System.out.println("Before suite");
	}
	@Test
	public void mobilesignoutlogin()
	{
		System.out.println("In Carmobilelogin");
	}
	
	@Test(dataProvider="getdata")
	public void Carapilogin(String username,String pwd)
	{
		System.out.println("In Carapilogin");
		System.out.println(username);
		System.out.println(pwd);
	}
	
	@DataProvider
	public Object getdata()
	{
		Object[][] data=new Object[3][2];
		
		data[0][0]="firstsetusername";
		data[0][1]="password";
		
		data[1][0]="secondsetusername";
		data[1][1]="password";
		
		data[2][0]="thirdsetusername";
		data[2][1]="password";
		
		return data;
	}



}
