package com.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class NewTest6 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hdfcbank.com/");
		Thread.sleep(5000);
		Actions act1=new Actions(driver);
		act1.moveToElement(driver.findElement(By.xpath("//a[@href='/personal/products']"))).perform();
		Thread.sleep(5000);
		act1.moveToElement(driver.findElement(By.xpath("//a[@href='/personal/products/cards']"))).perform();
		Thread.sleep(5000);
		act1.moveToElement(driver.findElement(By.xpath("//a[@href='/personal/products/cards/credit_cards']"))).click().perform();
		Assert.assertTrue(driver.getCurrentUrl().contains("cards"));
		//String s=driver.getTitle();
		//Assert.assertEquals(s, "Credit Cards - Apply for Credit Card Online with Maximum Benefits of your Choice | HDFC Bank");
		
	}

}
