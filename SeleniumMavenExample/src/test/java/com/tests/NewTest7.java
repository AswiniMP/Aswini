package com.tests;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest7 {

	@Test
	public void testDragandDrop()
	{
//		System.setProperty("webdriver.chrome.driver","C:\\Driver\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://demos.telerik.com/aspnet-ajax/treeview/examples/overview/defaultcs.aspx");
//		WebElement from =driver.findElement(By.xpath("//div[@id='ctl00_ContentPlaceholder1_RadTreeView1']/ul/li/ul/li[3]/ul/li[1]/div/div/span"));
//		WebElement to =driver.findElement(By.id("ctl00_ContentPlaceholder1_priceChecker"));
//		Actions act1 =new Actions(driver);
//		act1.dragAndDrop(from, to).perform();
//		WebDriverWait wait =new WebDriverWait(driver,10);
//		wait.until(ExpectedConditions.invisibilityOfElementWithText
//				(By.id("ctl00_ContentPlaceholder1_Label1"),"Drop a package here to check price" ));
//		String pricemessage=driver.findElement(By.id("ctl00_ContentPlaceholder1_Label1")).getText();
//		System.out.println(pricemessage);
//		Assert.assertTrue(pricemessage.contains("$3999"));	
		
		}
	
	@Test (priority=1)
	public void Keyboardaction() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cleartrip.com/");
		Thread.sleep(3000);
		Alert al=driver.switchTo().alert();
		al.accept();
		Thread.sleep(3000);
		WebElement from=driver.findElement(By.id("FromTag"));
		Actions act1=new Actions(driver);
		act1.keyDown(from,Keys.SHIFT).sendKeys("h").perform();
		Thread.sleep(3000);
		act1.keyDown(from,Keys.SHIFT).sendKeys("y").perform();
		Thread.sleep(3000);
		act1.keyDown(from,Keys.SHIFT).sendKeys("d").perform();
		act1.keyDown(from,Keys.ENTER).perform();	
		WebElement to = driver.findElement(By.id("ToTag"));
		to.sendKeys("che");
		//Thread.sleep(5000);
		WebDriverWait wait =new WebDriverWait(driver,15);
		wait.until(ExpectedConditions.presenceOfNestedElementsLocatedBy(By.id("ul-id-2"), By.className("List")));
		WebElement ul=driver.findElement(By.id("ul-id-2"));
		List<WebElement> list=ul.findElements(By.tagName("li"));
		for(WebElement e:list)
		{
			if(e.getText().contains("HDD"))
			{
				e.click();
				break;
			}
		}
		String val = driver.findElement(By.id("ToTag")).getAttribute("value");
		Assert.assertTrue(val.contains("HDD"));		
		
	}
}
