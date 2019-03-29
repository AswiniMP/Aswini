package com.tests;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTest5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hdfcbank.com/");
		Thread.sleep(5000);
		String ParentWindow=driver.getWindowHandle();
		System.out.println(ParentWindow);
		driver.findElement(By.id("loginsubmit")).click();
		Set<String> AllWindows=driver.getWindowHandles();
		for(String a:AllWindows)
		{
			System.out.println(a);
		}
	
//		driver.findElement(By.xpath("//*[contains(text(),'Continue to NetBanking')]")).click();
						
	}

}
