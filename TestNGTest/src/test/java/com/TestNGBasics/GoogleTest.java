package com.TestNGBasics;

import org.TestNgBase.Browser;
import org.TestNgBase.Locators;
import org.TestNgBase.SeleniumBase;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class GoogleTest extends SeleniumBase {
@Test
	void searchLetcode() {
		setUp(Browser.CHROME,"https://www.google.com/");;
		WebElement search = element(Locators.name, "q");
		typeEnter(search, "Letcode with Koushik", Keys.ENTER);
		quit();
	}
}
