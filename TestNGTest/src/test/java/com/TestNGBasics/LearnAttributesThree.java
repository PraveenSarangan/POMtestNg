package com.TestNGBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LearnAttributesThree {
	@Test(invocationCount = 3, invocationTimeOut = 20000)
	public void findNoOfWords() {
	System.setProperty("webdriver.chrome.driver", "D:\\NewDriver\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	String title = driver.getTitle();
	System.out.println(title);
	driver.switchTo().activeElement().sendKeys("cricket",Keys.ENTER);
	List<WebElement> findElements = driver.findElements(By.xpath("//*[contains(text(),'cricket') or contains (text(),'Cricket')]"));
	
System.out.println(findElements.size());
driver.quit();

	
	}
	
}
