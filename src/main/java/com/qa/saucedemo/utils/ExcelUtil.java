package com.qa.saucedemo.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
public class ExcelUtil {
	private static final String TEST_DATA_SHEET_PATH = "./src/test/resources/testdata/testdata.xlsx";
	private static Workbook book;
	private static Sheet sheet;

	@SuppressWarnings("static-access")
	public static Object[][] getTestData(String sheetName) {

		Object data[][] = null;
		try {
			FileInputStream ip = new FileInputStream(TEST_DATA_SHEET_PATH);
			book = WorkbookFactory.create(ip);
			sheet = book.getSheet(sheetName);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (InvalidFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		int rowcount = sheet.getLastRowNum();
		int cellcount = sheet.getRow(0).getLastCellNum();
		data = new Object[rowcount][cellcount];
		
		for(int i = 1;i<=rowcount;i++) {
			Row r =sheet.getRow(i);
			for(int j=0;j<=cellcount;j++) {
				Cell c = r.getCell(j, r.CREATE_NULL_AS_BLANK);
				try {
					if(c.getCellType() == c.CELL_TYPE_STRING)
					{
						data[i-1][j] = c.getStringCellValue();
					}
					else if(c.getCellType() == c.CELL_TYPE_NUMERIC) {
						data[i-1][j] = NumberToTextConverter.toText(c.getNumericCellValue());
					}
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
		}
		
		
		return data;
	}

}
