package org.CentricToAll1.TestNG.Listeners;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;



@Listeners(CustomListeners2.class)
public class TC002
{


    @Test(groups="smoke")
    public void test1()
    {
        System.out.println("testcase1");
        Assert.assertTrue(true);
    }


    @Test(groups = "sanity")
    public void test2()
    {
        System.out.println("testcase2");
        Assert.assertTrue(true);
    }

    @Test(groups = "regression")
    public void test3()
    {
        System.out.println("testcase3");
        Assert.assertTrue(true);
    }





}
