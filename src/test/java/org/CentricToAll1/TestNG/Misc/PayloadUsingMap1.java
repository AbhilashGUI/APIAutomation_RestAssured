package org.CentricToAll1.TestNG.Misc;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class PayloadUsingMap1
{
    RequestSpecification requestSpecification;
    ValidatableResponse validatableResponse;


    @Test
    public void testPostreq()
    {

        Map<String,Object> jsonbodyusingmap= new HashMap<>();
        jsonbodyusingmap.put("firstname","Abhilash");
        jsonbodyusingmap.put("lastname","Sharma");
        jsonbodyusingmap.put("totalprice",111);
        jsonbodyusingmap.put("depositpaid",true);


        Map<String,Object> bookingdates=new HashMap<>();
        bookingdates.put("checkin","2024-04-08");
        bookingdates.put("checkout","2024-04-28");

        jsonbodyusingmap.put("bookingdates",bookingdates);
        jsonbodyusingmap.put("additionalneeds","Breakfast");

        System.out.println(jsonbodyusingmap);

        //Note: We are using Hashmap, to overcome the reusability and maintainability issues of string payload.
        requestSpecification = RestAssured.given();
        requestSpecification.baseUri("https://restful-booker.herokuapp.com");
        requestSpecification.basePath("/booking");
        requestSpecification.contentType(ContentType.JSON);
        requestSpecification.body(jsonbodyusingmap).log().all();


        Response response = requestSpecification.when().post();

        Integer bookingid=response.then().extract().path("bookingid");

        validatableResponse = response.then().log().all();
        validatableResponse.statusCode(200);

        System.out.println("bookingid-->"+ bookingid);




    }


}





