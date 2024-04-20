package org.CentricToAll1.TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG01
{


    @BeforeMethod
    public void check1()
    {
        System.out.println("check1");
    }

    @Test

    public void testcase1()
    {
        System.out.println("Testcase1");
    }


    @Test
    public void testcase2()
    {
        System.out.println("Testcase2");
    }


    @AfterMethod
    public void check2()
    {
        System.out.println("Check2");
    }

//Note: For every test case beforemethod and aftermethod will run for sure


}
