package com.av;

import java.io.FileInputStream;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ReadExcelTest {
		public static void main(String[] args) throws BiffException, IOException  {
		     FileInputStream fis= new FileInputStream("av.xls");
		     //System.out.println(1);
		     Workbook workbook= Workbook.getWorkbook(fis);
		     //System.out.println(2);
		     Sheet sheet= workbook.getSheet(0);
		     //System.out.println(3);
		     Integer row = sheet.getRows();
		     //System.out.println(row);
		     Integer col = sheet.getColumns();
		     //System.out.println(col);
		     for(int i=0;i<row;i++) {
		    	 for(int j=0;j<col;j++) {
		    		 Cell cell= sheet.getCell(i,j);
		    	    // System.out.println(4);
		    	     String text = cell.getContents();
		    	     System.out.println(text);	 
		    	 }
		     }
	}

}
