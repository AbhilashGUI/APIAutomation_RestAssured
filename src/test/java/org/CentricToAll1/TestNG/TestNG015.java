package org.CentricToAll1.TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNG015 {

    //Data driven testing
    //Test- With Multiple inputs
    //login test: For 100 users
    //Registration DDT

    //Data provider- Test Data?
    //We are using 2d array for providing data


    @DataProvider
     public Object[][] getData()
    {
        return new Object[][]
                {
                 new Object[]{"admin","admin"},
                 new Object[]{"admin","password"},
                 new Object[]{"Vivek","Thandle@37"},
                 new Object[]{"Abhilash","Vicky@143"}
                };
    }


    @Test(dataProvider="getData")
    public void loginTest(String username,String password)
    {
        System.out.println("username");
        System.out.println("password");
    }


//In this case, we have four user credentials which is hardcoded.

}


