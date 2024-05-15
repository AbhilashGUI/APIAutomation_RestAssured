package org.CentricToAll1.TestNG.Listeners;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class TC001
{

    @Test(groups = "Sanity")
    public void test1()
    {
        System.out.println("Test1");
        Assert.assertTrue(false);
    }


    @Test(groups = "Sanity")
    public void test2()
    {
        System.out.println("Test2");
        Assert.assertTrue(true);
    }


}
