package org.CentricToAll1.TestNG;

import org.testng.annotations.*;

public class TestNG001
{

    @BeforeSuite
    void check1()
    {
        System.out.println("check1");
    }
    @BeforeTest
    void check2()
    {
        System.out.println("check2");
    }

    @BeforeClass
    void check3()
    {
        System.out.println("check3");
    }
    @BeforeMethod
    void check4()
    {
        System.out.println("check4");
    }

    @Test
    void testcase1()
    {
        System.out.println("Testcase1");
    }

     @AfterMethod
    void check5()
     {
         System.out.println("check5");
     }

     @AfterClass
    void check6() {
         System.out.println("check6");
     }


     @AfterTest
    void check7()
     {
         System.out.println("check7");
     }

     @AfterSuite
    void check8()
     {
         System.out.println("check8");
     }

     
     }




