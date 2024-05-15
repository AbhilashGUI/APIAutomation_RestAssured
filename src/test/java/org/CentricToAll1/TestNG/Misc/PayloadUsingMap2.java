package org.CentricToAll1.TestNG.Misc;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

import java.util.Map;
import java.util.TreeMap;

public class PayloadUsingMap2
{
    RequestSpecification requestSpecification;
    ValidatableResponse validatableResponse;


    @Test
    public void testPostreq()
    {
        Map<String, Object> jsonbodyusingmap=new TreeMap<>();
        jsonbodyusingmap.put("firstname","Dharamveer");
        jsonbodyusingmap.put("lastname","Satkuri");
        jsonbodyusingmap.put("totalprice",657);
        jsonbodyusingmap.put("depositpaid",true);


        Map<String,Object> bookingdates=new TreeMap<>();
        bookingdates.put("checkin","2024-06-01");
        bookingdates.put("checkout","2024-10-01");


        jsonbodyusingmap.put("bookingdates",bookingdates);
        jsonbodyusingmap.put("additionalneeds","Brunch");

        System.out.println(jsonbodyusingmap);



        requestSpecification=RestAssured.given();
        requestSpecification.baseUri("https://restful-booker.herokuapp.com");
        requestSpecification.basePath("/booking");
        requestSpecification.contentType(ContentType.JSON);
        requestSpecification.body(jsonbodyusingmap).log().all();



        Response response=requestSpecification.when().post();

        Integer bookingid=response.then().extract().path("bookingid");


        validatableResponse=response.then().log().all();
        validatableResponse.statusCode(200);

        System.out.println("bookingid-->"+bookingid);






    }
}
