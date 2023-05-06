package com.Utils;

import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelAtTest {

	public static String[][] getExcelData() throws IOException {
		
		String fileLocation ="./TestData/LoginData.xlsx";
		XSSFWorkbook wBook = new XSSFWorkbook(fileLocation);
		XSSFSheet sheetAt = wBook.getSheetAt(0);
		int lastRowNum = sheetAt.getLastRowNum();
		int physicalNumberOfRows = sheetAt.getPhysicalNumberOfRows();
		System.out.println("last Row "+lastRowNum);
		System.out.println("include Header "+physicalNumberOfRows);
		short lastCellNum = sheetAt.getRow(0).getLastCellNum();
		System.out.println("Last Cell "+lastCellNum);
		String [][] data = new String[lastRowNum][lastCellNum];
		
		for (int i = 1; i <= lastRowNum; i++) {
			XSSFRow row = sheetAt.getRow(i);
			for (int j = 0; j < lastCellNum; j++) {
				XSSFCell cell = row.getCell(j);
				//String stringCellValue = cell.getStringCellValue();
				
				  DataFormatter df = new DataFormatter(); 
				  String formatCellValue =df.formatCellValue(cell);
				 
				//System.out.println(formatCellValue);
				  data [i-1][j] = formatCellValue;
			} 
			
			
		}
		wBook.close();
		return data;
		

	}

}
