package com.Utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException {

		String fileLocation = "./TestData/LoginData.xlsx";
		XSSFWorkbook wBook= new XSSFWorkbook(fileLocation);
		XSSFSheet sheetAt = wBook.getSheetAt(0);
		for (int i = 1; i<3; i++) {
			XSSFRow row = sheetAt.getRow(i);
			for (int j = 0; j < 2; j++) {
				XSSFCell cell = row.getCell(j);
				String stringCellValue = cell.getStringCellValue();
				System.out.println(stringCellValue);
			} 
		}
		wBook.close();
	}
}
