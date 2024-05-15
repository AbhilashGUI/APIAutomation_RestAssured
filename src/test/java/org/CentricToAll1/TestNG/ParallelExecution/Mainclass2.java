package org.CentricToAll1.TestNG.ParallelExecution;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Mainclass2
{

    @BeforeMethod
    public void beforeMethod()
    {
        long id=Thread.currentThread().getId();
        System.out.println("Before Test-Method, thread id is :" +id+getClass().getSimpleName());

    }

    @Test
    public void testmethodone()
    {
        long id=Thread.currentThread().getId();
        System.out.println("First test case , thread id is :"+ id+getClass().getSimpleName());
    }


    @Test
    public void testmethodtwo()
    {
        long id =Thread.currentThread().getId();
        System.out.println("Second test case, thread id is :"+ id+getClass().getSimpleName());
    }


    @Test
    public void testmethodthree()
    {
        long id=Thread.currentThread().getId();
        System.out.println("Third test case, thread id is :" +id+getClass().getSimpleName());
    }

    @Test
    public void testmethodfour()
    {
        long id= Thread.currentThread().getId();
        System.out.println("Fourth test case, thread id is : " +id+getClass().getSimpleName());
    }


    @AfterMethod
    public void aftermethod()
    {
        long id= Thread.currentThread().getId();
        System.out.println("After test-method, thread id is :"+ id+getClass().getSimpleName());
    }


}
