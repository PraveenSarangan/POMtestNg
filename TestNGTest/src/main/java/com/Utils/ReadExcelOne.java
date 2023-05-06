package com.Utils;

import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelOne {

	public static void main(String[] args) throws IOException {
		
		String fileLocation = "./TestData/LoginData.xlsx";
		XSSFWorkbook wBook = new XSSFWorkbook(fileLocation);
		XSSFSheet sheetAt = wBook.getSheetAt(0);
				int lastRowNum = sheetAt.getLastRowNum();
		int physicalNumberOfRows = sheetAt.getPhysicalNumberOfRows();
		System.out.println("Last Row " +lastRowNum);
		System.out.println("inclusive of header Row " +physicalNumberOfRows);
		short lastCellNum = sheetAt.getRow(0).getLastCellNum();
		System.out.println("Last Cell No " +lastCellNum);
		for (int i = 1; i <= lastRowNum; i++) {
			XSSFRow row = sheetAt.getRow(i);
			for (int j = 0; j < lastCellNum; j++) {
				XSSFCell cell = row.getCell(j);
				DataFormatter df = new DataFormatter();
				String formatCellValue = df.formatCellValue(cell);
				//String stringCellValue = cell.getStringCellValue();
				
				System.out.println(formatCellValue);
			} 
			wBook.close();
		}
	}


}
