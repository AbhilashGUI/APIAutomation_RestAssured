package org.CentricToAll1.TestNG.DDT;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class UtilExcel1
{

    static Workbook book;
    static Sheet sheet;

    public static String File_Name1="src/test/resources/login credentials.xlsx";

    public Object[][] getTestData (String sheetname)
{
    FileInputStream file1=null;
    try {
        file1=new FileInputStream(File_Name1);
    }catch (FileNotFoundException e) {
        e.printStackTrace();
    }

    try {
        book= WorkbookFactory.create(file1);
    }catch (IOException e)
    {
        e.printStackTrace();
    }

    sheet=book.getSheet(sheetname);
    Object[][] credentials= new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
    for (int i = 0; i < sheet.getLastRowNum(); i++) {
        for (int j = 0; j < sheet.getRow(0).getLastCellNum(); j++) {
          credentials[i][j]=sheet.getRow(i+1).getCell(j).toString();
        }

    }

    return credentials;


}
@DataProvider
    public Object[][] getCredentials(){
        return getTestData("Sheet1");
}


}
