package com.Utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadProp {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		Properties read = new Properties();
		read.load(new FileInputStream("./LetcodeEng.properties"));
		String property = read.getProperty("welcome");
		System.out.println(property);
	}

}
