package org.CentricToAll1.TestNG.DDT;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

import javax.imageio.stream.FileImageInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class UtilExcel2
{

    static Workbook book;
    static Sheet sheet;

    public static String File_Name2="src/test/resources/Valid Credentials.xlsx";

    public Object[][] getTestData (String Sheetname) {
        FileInputStream file2 = null;
        try {
            file2 = new FileInputStream(File_Name2);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try {
            book = WorkbookFactory.create(file2);

        } catch (IOException e) {
            e.printStackTrace();
        }

        sheet = book.getSheet(Sheetname);
        Object[][] Credentials = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
        for (int i = 0; i < sheet.getLastRowNum(); i++) {
            for (int j = 0; j < sheet.getRow(0).getLastCellNum(); j++) {
                Credentials[i][j] = sheet.getRow(i + 1).getCell(j).toString();

            }

        }

        return Credentials;
    }
@DataProvider
public Object[][] getCredentials(){
    return getTestData("Sheet1");
    }



    }

