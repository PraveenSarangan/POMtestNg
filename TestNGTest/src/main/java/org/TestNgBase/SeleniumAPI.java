package org.TestNgBase;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public interface SeleniumAPI {
	
	/**
	 * This will launch the ChromeBrowser with the given URL
	 * @author HP
	 * @param url
	 * @exception NullPointerException
	 */
	
	void setUp(String url);
	/**
	 * This will launch the given Browser with the given URL
	 * @param browserName
	 * @param url
	 */
	
	void setUp(Browser browserName ,String url);
	
	
	void close();
	
	
	void quit();
	/**
	 * This method used to find any WebElement with in the page
	 * @param type - id,name,xpath,class
	 * @param value - element value
	 * @return WebElement
	 */
	
	WebElement element(Locators type, String value);
	void type(WebElement ele , String tesData);
	
	void typeEnter(WebElement ele , String testData, Keys key);
	
	void switchToWindow(int i);
	

	void selectValue(WebElement ele, String value);
	
	void selectText(WebElement ele, String text);
	
	void selectIndex(WebElement ele, int position);
	
	void click(WebElement ele);
	
	void appenText(WebElement ele, String testData);
	
	String getTitle();
	
	String getUrl();
	
	boolean isDisplayed(WebElement ele);
}
