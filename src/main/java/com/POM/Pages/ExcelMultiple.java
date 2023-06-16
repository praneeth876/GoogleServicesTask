package com.POM.Pages;

import java.io.IOException;

import com.Utility.ExcelUtility;

public class ExcelMultiple {
	//static int i;
public static void main(String[] args) throws IOException {
	ExcelUtility util=new ExcelUtility("./src/main/resources/GoogleServices.xlsx","sheet1");
	
for(int i=0;i<=util.getLastRowNumber();i++) {
	for(int j=0;j<util.getLastCellNumber(i);j++) {
		
		String data=util.getData( i, j);
		System.out.print(data+" ");
	}
	System.out.println();
	
}
}
}