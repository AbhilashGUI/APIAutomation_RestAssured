package org.CentricToAll1.TestNG.POJO;

import org.testng.annotations.Test;

public class PayloadUsingpojo1
{

  @Test
    public void testPostreq()
  {
      booking1 booking1=new booking1();
      booking1.setFirstname("Abhilash");
      booking1.setLastname("Sharma");
      booking1.setTotalprice(900);
      booking1.setDepositpaid(false);

      bookingdates1 bookingdates1=new bookingdates1();
      bookingdates1.setCheckin("2024-05-12");
      bookingdates1.setCheckout("2024-06-15");
      booking1.setBookingdates(bookingdates1);
      booking1.setAdditionalneeds("Brunch");

      System.out.println(booking1);






  }






}
