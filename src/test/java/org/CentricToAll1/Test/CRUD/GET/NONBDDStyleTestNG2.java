package org.CentricToAll1.Test.CRUD.GET;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class NONBDDStyleTestNG2
{

    @Test
    public void testGetAllBookingPositive()

    {
        RequestSpecification r= RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/booking/649");
        r.when().log().all()
                .get();
        r.then().log().all().statusCode(200);

    }
    @Test(enabled = false)
    public void testGetAllBookingNegative1()
    {
        RequestSpecification r= RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/booking/-12");
        r.when().log().all()
                .get();
        r.then().log().all().statusCode(404);

    }
    @Test
    public void testGetAllBookingNegative2()
    {
        RequestSpecification r= RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/booking/xyz");
        r.when().log().all()
                .get();
        r.then().log().all().statusCode(404);

    }
}


//Note: So the latest testngallanotations.xml file is seen as  expected.