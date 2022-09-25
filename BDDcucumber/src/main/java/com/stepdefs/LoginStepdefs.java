package com.stepdefs;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepdefs {
	
	WebDriver driver=null;
	
	@Given("^user will be on login page$")
	public void user_will_be_on_login_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "D:\\01. Java\\Setup\\chrom_102 version\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("file:///D:/01.%20Java/Setup/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		
	}

	@When("^user enter valid credentials$")
	public void user_enter_valid_credentials() throws Throwable {
		
		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("//button")).click();
	    
	}

	@Then("^user should be on home page$")
	public void user_should_be_on_home_page() throws Throwable {
		
		Assert.assertEquals(driver.getTitle(), "JavaByKiran | Dashboard");
	    
	}

}
