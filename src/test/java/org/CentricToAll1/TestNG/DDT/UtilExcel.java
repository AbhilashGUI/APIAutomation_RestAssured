package org.CentricToAll1.TestNG.DDT;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class UtilExcel {

    //Workbook,Sheet,Row,Column and Cell

    //Open stream
    //Understand workbook
    //Sheet
    //Row, Column
    //Cells
    //Close stream- get data to the object[][]

    static Workbook book;
    static Sheet sheet;

    public static String FILE_NAME = "src/test/resources/Test Data.xlsx";

    public static Object[][] getTestData(String sheetName) {
        FileInputStream file = null;
        try {
            file = new FileInputStream(FILE_NAME);  //fetching the file path
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            book = WorkbookFactory.create(file);  //Reading the file from the workbook

        } catch (IOException e) {
            e.printStackTrace();
        }

        sheet = book.getSheet(sheetName);
        Object[][] credentials = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
        for (int i = 0; i < sheet.getLastRowNum(); i++) {
            for (int j = 0; j < sheet.getRow(0).getLastCellNum(); j++) {
                credentials[i][j] = sheet.getRow(i + 1).getCell(j).toString();
            }
        }

        return credentials;

    }

    @DataProvider
    public Object[][] getinfo() {
        return getTestData("Sheet1");
    }
}


