package com.orangeHRM.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public WebDriver driver;
	
	
	@BeforeMethod
	public void browserLanunch() {
		// Set the path to the ChromeDriver executable
	       WebDriverManager.chromedriver().setup();

	        // Create an instance of the ChromeDriver
	        driver = new ChromeDriver();
	      
	        
	        //Delete all cookies.
	        driver.manage().deleteAllCookies();
	        
	        //Maximize the browser.
	        driver.manage().window().maximize();

	        // Navigate to a website
	        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.close();
	}
	
	

}
