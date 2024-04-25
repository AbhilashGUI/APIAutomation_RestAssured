package org.CentricToAll1.TestNG;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG005
{


    //In this case, we are using 2 Beforetest annotations and one testcase. Executing in the order of 2,1 and 3
    @BeforeTest
    public void gettoken()
    {
        System.out.println("2");
    }


    @BeforeTest
    public void getbookingId()
    {
        System.out.println("1");

    }

    @Test

    public void Testcase1()
    {
        System.out.println("1 and 2");
    }



}
