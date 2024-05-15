package org.CentricToAll1.TestNG;

import org.testng.annotations.Test;

public class TestNG013
{

    @Test(groups = {"init"},priority = 1)
    public void getToken()
    {
        System.out.println("Token got created");
    }

   @Test(groups = {"init"},priority = 2,enabled = false)
    public void getBookingid()
   {
       System.out.println("Booking id got created");
   }


   @Test(dependsOnGroups = {"init.*"})
    public void PutRequest()
   {
       System.out.println("Put request is created");
   }



//Note: Based on the priority the test cases are executed. enabled = false represents inactive.
}





