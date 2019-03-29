package com.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.interactions.Actions;
public class CaseStudy {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
		Thread.sleep(5000);
		Actions act1=new Actions(driver);
		driver.findElement(By.xpath("//a[@href='/register']")).click();		
		Thread.sleep(5000);
		driver.findElement(By.id("gender-female")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Aswini");
		driver.findElement(By.id("LastName")).sendKeys("MP");
		driver.findElement(By.id("Email")).sendKeys("email121@yourdomain.test");
		driver.findElement(By.id("Password")).sendKeys("abcd123");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("abcd123");
		driver.findElement(By.id("register-button")).click();
		driver.findElement(By.cssSelector("input[class='button-1 register-continue-button']")).click();
	}
}
