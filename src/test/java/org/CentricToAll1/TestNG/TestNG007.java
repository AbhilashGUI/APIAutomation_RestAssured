package org.CentricToAll1.TestNG;

import org.testng.annotations.Test;

public class TestNG007
{

    @Test(priority = 1)
    public void t1()
    {
        System.out.println("1");
    }

    @Test(priority = -2)
    public void t2()
    {
        System.out.println("2");
    }

    @Test(priority = 0)
    public void t3()
    {
        System.out.println("3");
    }


}

//Note: The testcases will executed based on defined priority.