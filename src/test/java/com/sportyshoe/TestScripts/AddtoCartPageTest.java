package com.sportyshoe.TestScripts;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.SportyShoes.Selenium_scripts_using_TestNG.AddtoCartPage;
import com.SportyShoes.Selenium_scripts_using_TestNG.HomePage;
import com.SportyShoes.Selenium_scripts_using_TestNG.LoginPage;
import com.SportyShoes.Selenium_scripts_using_TestNG.RegisterPage;
import com.SportyShoes.Selenium_scripts_using_TestNG.TestBase;

public class AddtoCartPageTest extends TestBase {
	
	HomePage hp;
	RegisterPage rp;
	LoginPage lp;
	AddtoCartPage ac;
	
	@BeforeTest
	public void start_browser()
	{
		OpenBrowser("Chrome");
		hp = new HomePage(driver);
		rp = new RegisterPage(driver);
		lp = new LoginPage(driver);
		ac = new AddtoCartPage(driver);
	}
	
	@Test(priority='1')
	public void test_login()
	{
		lp.user_login();
	}
	

	@Test(priority='2')
	public void test_add_product_to_cart() throws InterruptedException
	{
		ac.add_product_to_cart();
	}
	
	@Test(priority='3')
	public void test_validate_success_message()
	{
		String expected = "Message:Shoe BlueWave Running Shoes Added Successfully to Cart";
	String actualText=	ac.validate_success_message();
	Assert.assertEquals(actualText, expected);
	}



}


