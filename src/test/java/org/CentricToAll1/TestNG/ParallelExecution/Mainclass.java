package org.CentricToAll1.TestNG.ParallelExecution;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Mainclass
{

    //Concept of parallel execution using threads

    @BeforeMethod
    public void beforeMethod()
    {
        long id= Thread.currentThread().getId();
        System.out.println("Before test-Method. Thread id is: "  +id+getClass().getSimpleName());

    }

    @Test
    public void testMethodsOne()
    {
     long id =Thread.currentThread().getPriority();
     System.out.println("Simple test method one.  Thread id is : " +id+getClass().getSimpleName());
    }


    @Test
    public void testMethodsTwo()
    {
        long id=Thread.currentThread().getId();
        System.out.println("Simple test method two. Thread id is :" +id+getClass().getSimpleName());
    }

    @AfterMethod
    public void afterMethod()
    {
        long id=Thread.currentThread().getPriority();
        System.out.println("After test-Method. Thread id is : " +id+getClass().getSimpleName());

    }



}
