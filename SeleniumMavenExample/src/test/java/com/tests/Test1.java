package com.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test1 {

	@Test
	public void testGoogle(){
		System.out.println("welcome to google");
	}
	
	@Test
	public void testAccenturePage(){
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_c2a.04.29\\Desktop\\driver\\chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver",);
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		String pageTitle = driver.getTitle();
		Assert.assertEquals(pageTitle, "Goog");
	}
}
