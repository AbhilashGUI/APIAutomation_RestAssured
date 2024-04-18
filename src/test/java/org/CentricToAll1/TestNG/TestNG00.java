package org.CentricToAll1.TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG00
{

    @Test
    public void testcase1()
    {
        Assert.assertEquals("true","false");

    }

    @Test
    public void testcase2()
    {
        Assert.assertEquals("false","true");
    }


    @Test
    public void testcase3()
    {

        Assert.assertEquals("true","true");
    }
}
