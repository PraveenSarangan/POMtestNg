package com.TestNGBasics;

import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String File = "./TestData/LoginData.xlsx";
		XSSFWorkbook book = new XSSFWorkbook(File);
		XSSFSheet sheetAt = book.getSheetAt(0);
		int lastRowNum = sheetAt.getLastRowNum();
		System.out.println(lastRowNum);
		short lastCellNum = sheetAt.getRow(0).getLastCellNum();
		System.out.println(lastCellNum);
	for (int i = 1; i <= lastRowNum; i++) {
		XSSFRow row = sheetAt.getRow(i);
		
		for (int j = 0; j <= lastCellNum; j++) {
			XSSFCell cell = row.getCell(j);
			DataFormatter df = new DataFormatter();
			String formatCellValue = df.formatCellValue(cell);
			//String stringCellValue = cell.getStringCellValue();
			System.out.println(formatCellValue);
		} 
	}
	}

}
