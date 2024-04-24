package org.CentricToAll1.TestNG;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG004
{
    String token;
    String bookingId;


    public String getToken()
    {
        token="123";        //Defining the token
        return token;
    }


    @BeforeTest
    public void gettokenAndbookingId()
    {
        token=getToken();    //Fetching the token, which is defined above
        bookingId="123";

    }

    @Test
    public void Putrequest()
    {
        System.out.println(token);
        System.out.println(bookingId);
    }

    @Test
    public void Putrequest2()
    {
        System.out.println(token);
        System.out.println(bookingId);
    }

//We have 2 testcases, which prints token and bookingID as declared.
}
