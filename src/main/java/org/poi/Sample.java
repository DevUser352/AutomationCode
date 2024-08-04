package org.poi;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Sample {

    public static void main(String[] args) throws IOException {

        String excelFilePath = System.getProperty("user.dir")+"\\files\\employee.xlsx";
        File excelFile = new File(excelFilePath);
        FileInputStream fileInputStream = new FileInputStream(excelFile);
        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
        XSSFSheet sheet = workbook.getSheet("one");

        int lastRowNum = sheet.getLastRowNum();
        short lastCellNum = sheet.getRow(1).getLastCellNum();

        for (int r = 0; r <= lastRowNum; r++){
            XSSFRow row = sheet.getRow(r);
            for (int c = 0; c < lastCellNum; c++){
                XSSFCell cell = row.getCell(c);
                CellType cellType = cell.getCellType();

                switch (cellType){

                    case STRING:
                        System.out.print(cell.getStringCellValue());
                        break;
                    case NUMERIC:
                        System.out.print(cell.getNumericCellValue());
                        break;
                    case BOOLEAN:
                        System.out.print(cell.getBooleanCellValue());
                        break;
                }

            System.out.print(" ");
            }
            System.out.println();
        }

    }
}
