package org.CentricToAll1.TestNG;

import org.testng.annotations.Test;

public class TestNG011
{

    @Test
    public void ServerStartedOk()
    {
        System.out.println("I will run first");
    }

    @Test(dependsOnMethods = "ServerStartedOk")
    public void method1()
    {
        System.out.println("Method1");
    }

//Note: Since ServerStartedOk case  executes first and then case2

}
