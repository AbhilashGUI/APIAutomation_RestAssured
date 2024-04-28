package org.CentricToAll1.TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG010
{

    @Test()
    public void testcase1()
    {
     Assert.assertEquals("True","Fail","This should fail");
    }

    @Test
    public void testcase2()
    {
        Assert.assertEquals("False","False","This should match");
    }


}
