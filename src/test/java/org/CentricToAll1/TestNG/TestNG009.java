package org.CentricToAll1.TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNG009
{
    @Test
    void testcase1()
    {

        //Soft Assertion
        SoftAssert s= new SoftAssert();
        s.assertEquals(true,false,"True should not be equal to false");
        System.out.println("Please execute me");
        s.assertAll();     //Is used to print the statement though the execution is failed

    }

    @Test
    void testcase2()
            //Hard Assertion
    {
        Assert.assertEquals("False","True", "False cannot be True");
        System.out.println("This will not print");
    }


}
