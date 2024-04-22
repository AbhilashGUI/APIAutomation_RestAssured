package org.CentricToAll1.TestNG;

import org.testng.annotations.*;

public class TestNG002
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

    @Test
    void testcase2() {
        System.out.println("Testcase2");
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



    //In this case we have 2 testcases for case1 all Before annotations are allowed and one After annotation.
    //Where are for other case one before method annotation and all after method annotations are allowed.

}
