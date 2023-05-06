package com.TestNGBasics;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

import com.Utils.ReadExcelAtTest;

public class DataUtils {
	@DataProvider( name = "login" ,/*indices = { 1,2}*/ parallel = !true)
	public String[][] getData() throws IOException {
		String[][] excelData = ReadExcelAtTest.getExcelData();
		
//		String [][] data = new String[3][2];
//		data[0][0]= "Praveenjames.r@gmail.com";
//		data[0][1] = "Rfid@123";
//		data[1][0] ="koushik1@letcode.in";
//		data[1][1] ="Pass123$";
//		data[2][0] ="LetCode";
//		data[2][1] = "Pass@123"	;	
		return excelData;
	}
	
	public static ChromeDriver launchBrouser() {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		return driver;
	
		
	}

}
