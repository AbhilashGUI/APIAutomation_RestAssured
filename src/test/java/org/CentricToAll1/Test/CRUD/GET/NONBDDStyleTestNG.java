package org.CentricToAll1.Test.CRUD.GET;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class NONBDDStyleTestNG

{
    @Test
    public void testGetAllBookingPositive()
    {

        //Since we are using a Get method and we require

        //Method: GET
        //URL: URI+Basepath

        RequestSpecification r= RestAssured.given();

        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/booking/649");
        r.when().log().all()
                .get();
        r.then().log().all().statusCode(200);

    }

    @Test
   public  void testGetAllBookingNegative()
    {

        RequestSpecification r= RestAssured.given();

        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/booking/-1");
        r.when().log().all()
                .get();
        r.then().log().all().statusCode(404);
    }

    @Test
   public void testGetAllBookingNegative1()
    {

        RequestSpecification r= RestAssured.given();

        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/booking/abc");
        r.when().log().all()
                .get();
        r.then().log().all().statusCode(404);
    }

}
