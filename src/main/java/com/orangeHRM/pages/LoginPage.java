package com.orangeHRM.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	public  WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By username = By.name("username");
	By password = By.name("password");
	By logo = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/img[1]");
	By loginbtn = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[3]/button[1]");
	
	
	
	public boolean validateLogo() {
		driver.findElement(logo).isDisplayed();
		return true;
		
	}
	
	public void login(String uname, String upassword) throws InterruptedException {
		driver.findElement(username).sendKeys(uname);
		driver.findElement(password).sendKeys(upassword);
		Thread.sleep(3000);
		driver.findElement(loginbtn).click();
		
		
	}
}
