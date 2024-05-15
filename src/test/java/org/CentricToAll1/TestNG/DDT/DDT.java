package org.CentricToAll1.TestNG.DDT;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DDT
{
 //Test data: Reading the  test data from Excel file
    //Apache POI is the reporting mechanism will use by adding the dependency in POM.xml file
    //Apache is used 60%-70%
    //Fillo libray is used 30%

    //Since there is no support directly in java to read excel file , we are using Apache POI



    @Test(dataProvider="getinfo", dataProviderClass=UtilExcel.class )

    public void testlogin(String username,String password)
    {
        System.out.println("Username--"+username);
        System.out.println("Password--"+password);
    }




//using the dataprovider function to get data and dataproviderclass to get the data from excel file

}
