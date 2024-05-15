package org.CentricToAll1.TestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNG014
{


    @Parameters("browser")
            @Test(priority = 1)
            void demo(String value)
    {
      System.out.println("Browser is"+ value);

    }
}

//Not: In this case , we are executing TestNG file.