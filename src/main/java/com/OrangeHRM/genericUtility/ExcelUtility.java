package com.OrangeHRM.genericUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
//this is to read the date from excel

public class ExcelUtility {
	FileInputStream fis = null;
	Workbook wb = null;

	public String getExcelData(String excelPath, String sheetName, int row, int cell) {

		try {
			fis = new FileInputStream(excelPath);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			wb = WorkbookFactory.create(fis);
		} catch (EncryptedDocumentException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		DataFormatter df = new DataFormatter();
		String data = df.formatCellValue(wb.getSheet(sheetName).getRow(row).getCell(cell));
		return data;
	}

	public void closeExcel() {
		try {
			wb.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			fis.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
