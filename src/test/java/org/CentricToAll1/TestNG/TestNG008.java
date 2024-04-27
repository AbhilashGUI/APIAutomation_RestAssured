package org.CentricToAll1.TestNG;

import org.testng.annotations.Test;

public class TestNG008
{

    @Test(groups = {"Sanity","QA"})
    public void sanityRun()
    {
        System.out.println("Sanity");
        System.out.println("QA");
    }

    @Test(groups = {"Reg","Sanity","E2E","Preprod"})
    public void regrun()
    {
        System.out.println("Reg");
    }


    @Test(groups = {"Smoke","Sanity","Developer"})
    public void smokerun()
    {
        System.out.println("Smoke");
    }


//Note: Manipulating the testcases execution via TestNG file.



}
