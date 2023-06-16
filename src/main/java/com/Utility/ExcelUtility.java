package com.Utility;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {
	FileInputStream file;
	FileOutputStream fileoutput;
	XSSFWorkbook workbook;
	XSSFSheet sheet;
    XSSFRow row;
    XSSFCell cell;
    int noOfRows;
    int noOfCells;
    
    public ExcelUtility(String excelPath,String sheetName) throws IOException {
    	file=new FileInputStream(excelPath);
		workbook=new XSSFWorkbook(file);
		sheet=workbook.getSheet(sheetName);    
    }
    
    public int getLastRowNumber() {
    //	sheet=workbook.getSheet(sheetName);
    	int noOfRows= sheet.getLastRowNum();
		return noOfRows;
    }
    
    public int getLastCellNumber(int Rowindex) {
    	//sheet=workbook.getSheet(sheetName);
        row=sheet.getRow(Rowindex);
    	int noOfCells= row.getLastCellNum();
		return noOfCells;
    }
    
    
    public String getData(int rowIndex,int cellIndex) throws IOException {
    //	sheet=workbook.getSheet(sheetName);
    	row=sheet.getRow(rowIndex);
		cell=row.getCell(cellIndex);
		String data=cell.getStringCellValue();
		
		return data;
	}
    
	public void setData(String sheetName,int rowIndex,int cellIndex,String data) throws IOException {
		sheet=workbook.getSheet(sheetName);
		row=sheet.createRow(rowIndex);
		cell=row.createCell(cellIndex);
		cell.setCellValue(data);
	}
	
	public void Excelwrite(String destExcelFile) throws IOException {
	    fileoutput=new FileOutputStream(destExcelFile);
		workbook.write(fileoutput);
		
	}
}
