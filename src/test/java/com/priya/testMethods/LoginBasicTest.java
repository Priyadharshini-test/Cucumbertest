package com.priya.testMethods;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class LoginBasicTest {
	protected static String excelFilePath = "./src/test/resources/exceltestdata/Testdata1.xlsx";
	public static String username;
	public static String password;

	public static void readDataFromExcelFile(int rownum, String sheetname) throws IOException {

		File excelfile = new File(excelFilePath);
		FileInputStream inputStream = new FileInputStream(excelfile);

		XSSFWorkbook wb = new XSSFWorkbook(inputStream);
		XSSFSheet sheet = wb.getSheet(sheetname);

		username = sheet.getRow(rownum).getCell(0).getStringCellValue();
		password = sheet.getRow(rownum).getCell(1).getStringCellValue();
	}

}
