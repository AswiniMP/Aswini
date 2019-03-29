package com.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaseStudy2 
{
@Test 
//Test case 1
public void Login() throws InterruptedException{
	System.setProperty("webdriver.chrome.driver","C:\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://demowebshop.tricentis.com/");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//a[@href='/login']")).click();	
	Thread.sleep(5000);
	driver.findElement(By.id("Email")).sendKeys("email121@yourdomain.test");
	driver.findElement(By.id("Password")).sendKeys("abcd123");
	driver.findElement(By.cssSelector("input[class='button-1 login-button']")).click();
	String s = driver.findElement(By.xpath("//a[@href='/logout']")).getText();
	Assert.assertEquals(s, "Log out");
	
}

}
