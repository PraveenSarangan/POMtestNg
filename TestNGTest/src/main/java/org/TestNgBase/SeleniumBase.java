package org.TestNgBase;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumBase implements SeleniumAPI{
	long timeOuts = 20;
	long maxWaitTime = 10;
	RemoteWebDriver driver = null;
	WebDriverWait wait = null;

	public void setUp(String url) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(timeOuts, TimeUnit.SECONDS);
		driver.get(url);
		wait = new WebDriverWait(driver, maxWaitTime);

	}

	public void setUp(Browser browserName, String url) {
		switch (browserName) {
		case CHROME:
			driver = new ChromeDriver();			
			break;
		case FIREFOX:
			driver = new FirefoxDriver();			
			break;
		case EDGE:
			driver = new EdgeDriver();			
			break;


		default:
			System.err.println("Driver id not defined");
			break;
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(timeOuts, TimeUnit.SECONDS);
		driver.get(url);
		wait = new WebDriverWait(driver, maxWaitTime);


	}


	public void close() {

		driver.close();
	}
	public void quit() {

		driver.quit();
	}


	public WebElement element(Locators type, String value) {

		switch (type) {
		case id:
			return driver.findElement(By.id(value));


		case name:
			return driver.findElement(By.name(value));


		case link:
			return driver.findElement(By.linkText(value));

		case xpath:
			return driver.findElement(By.xpath(value));


		default:
			break;
		}

		return null;
	}


	public void switchToWindow(int i) {
		Set<String> windowHandles = driver.getWindowHandles();
		ArrayList<String> list = new ArrayList<String>(windowHandles);
		driver.switchTo().window(list.get(i));


	}


	public void selectValue(WebElement ele, String value) {
		WebElement element = isElementVisible(ele);
		new Select(element).selectByValue(value);

	}


	public void selectText(WebElement ele, String text) {
		WebElement element = isElementVisible(ele);
		new Select(element).selectByVisibleText(text);

	}


	public void selectIndex(WebElement ele, int position) {
		WebElement element = isElementVisible(ele);
		new Select(element).selectByIndex(position);

	}


	public void click(WebElement ele) {
		WebElement element = wait.withMessage("Element not clickable").until(ExpectedConditions.elementToBeClickable(ele));
		element.click();


	}


	public void appenText(WebElement ele, String testData) {
		WebElement element = isElementVisible(ele);
		element.sendKeys(testData);

	}


	public String getTitle() {
		return	driver.getTitle();


	}


	public String getUrl() {

		return driver.getCurrentUrl();
	}


	public boolean isDisplayed(WebElement ele) {
		return ele.isDisplayed();

	}


	public void type(WebElement ele, String textData) {
		WebElement element = isElementVisible(ele);
		element.clear();
		element.sendKeys(textData);

	}

	private WebElement isElementVisible(WebElement ele) {
		WebElement element = wait.until(ExpectedConditions.visibilityOf(ele));
		return element;
	}


	public void typeEnter(WebElement ele, String testData, Keys key) {
		WebElement element = isElementVisible(ele);
		element.clear();
		element.sendKeys(testData,key);

	}

}
