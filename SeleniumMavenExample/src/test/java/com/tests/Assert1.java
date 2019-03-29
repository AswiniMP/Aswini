package com.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Assert1 {
@Test
public void Check()
{
	System.setProperty("webdriver.chrome.driver","C:\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.hdfcbank.com/entryihuh");
	
}
	
}
