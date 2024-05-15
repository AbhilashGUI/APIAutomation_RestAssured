package org.CentricToAll1.TestNG.POJO;

import org.testng.annotations.Test;

public class PayloadUsingpojo
{
    @Test
    public void testPostreq()
    {
        booking booking=new booking();
        booking.setFirstname("Abhilash");
        booking.setLastname("Sharma");
        booking.setTotalprice(264);
        booking.setDepositpaid(true);


        bookingdates bookingdates=new bookingdates();
        bookingdates.setCheckin("2024-02-01");
        bookingdates.setCheckout("2024-02-01");
        booking.setBookingdates(bookingdates);
        booking.setAdditionalneeds("Breakfast");

        System.out.println(booking);
    }



}
