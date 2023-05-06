package com.Utils;

import org.testng.annotations.DataProvider;

public class DataUtilsTest {
	
	@DataProvider(name = "login", parallel = !true, indices = {0,1})
	public String[][] getData()
	{
		String[][] data = new String [3][2];
		
		data[0][0] = "praveenjames.r@gmail.com";
		data[0][1] = "Rfid@123";
				
		data[1][0] = "koushik1@letcode.in";
		data[1][1] = "Pass123$";
		
		data[2][0] = "last data";
		data[2][1] = "Pass123$";
		
		return data;
	}

}
