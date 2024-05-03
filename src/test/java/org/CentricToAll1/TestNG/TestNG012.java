package org.CentricToAll1.TestNG;

import org.testng.annotations.Test;

public class TestNG012
{
    @Test(groups = {"init"})
    public void initServerStartedOk()
    {
        System.out.println("ServerStartedOk");
    }

    @Test(groups = {"init"})
    public void initEnvironment()
    {
        System.out.println("initEnvironment");
    }

    @Test(dependsOnGroups = {"init.*"})
    public void method1()
    {
        System.out.println("Now I will run");
    }


//Note: In this case, we are using In-built functions with defined string init . However * represents all , but then random case will execute.


}
