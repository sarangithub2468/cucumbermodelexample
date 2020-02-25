package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static Object [][] readData(String filename) throws IOException{
	
	// TODO Auto-generated method stub
		XSSFWorkbook wbook = new XSSFWorkbook("D:\\TestLeaf\\Selenium\\Data\\"+filename+".xlsx");	
				XSSFSheet sheet = wbook.getSheetAt(0);				
				int rowCount = sheet.getLastRowNum();
				System.out.println(rowCount);
				short colCount = sheet.getRow(0).getLastCellNum();
				System.out.println(colCount);
				String[][] data = new String[rowCount][colCount];				
				for(int i=1;i<=rowCount;i++) {		
					XSSFRow row = sheet.getRow(i);
					System.out.println(row);
					for(int j=0;j<colCount;j++) {		
					XSSFCell cell = row.getCell(j);
			/*		String cellText = cell.getStringCellValue();
					System.out.println(cellText);*/
					data[i-1][j]=cell.getStringCellValue();
					}
					
				}
				wbook.close();
				return data;
		}



}

