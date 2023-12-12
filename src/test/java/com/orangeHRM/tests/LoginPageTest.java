package com.orangeHRM.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.orangeHRM.pages.BaseClass;
import com.orangeHRM.pages.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPageTest extends BaseClass {
	
	
	
	

	@Test(enabled=false)
	public void logoDisplay() throws InterruptedException {
		 
	        LoginPage lp = new LoginPage(driver);
	        Thread.sleep(3000);
	        
	        boolean flag = lp.validateLogo();
	        
	        Assert.assertTrue(flag);
		
	}
	
	@Test
	public void login() throws InterruptedException {
		LoginPage lp = new LoginPage(driver);
		 Thread.sleep(3000);
		lp.login("Admin", "admin123");
		String expUrl ="https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
		String actUrl = driver.getCurrentUrl();
		Assert.assertEquals(actUrl, expUrl, "Url as expected");
	}
	
	
}
