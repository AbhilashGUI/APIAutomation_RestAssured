package org.CentricToAll1.TestNG.Misc;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

import java.util.LinkedHashMap;
import java.util.Map;

public class PayloadUsingMap3
{
    RequestSpecification requestSpecification;
    ValidatableResponse validatableResponse;


    @Test
    public void testPostreq()
    {

        Map<String,Object> jsonbodyusingmap= new LinkedHashMap<>();
        jsonbodyusingmap.put("firstname","Abhilash");
        jsonbodyusingmap.put("lastname","Vicky");
        jsonbodyusingmap.put("totalprice",256);
        jsonbodyusingmap.put("depositpaid",true);


        Map<String,Object> bookingdates=new LinkedHashMap<>();
        bookingdates.put("checkin","2024-05-26");
        bookingdates.put("checkout","2024-06-12");


        jsonbodyusingmap.put("bookingdates",bookingdates);
        jsonbodyusingmap.put("additionalneeds","dinner");


        System.out.println(jsonbodyusingmap);
        //Note: We are using Hashmap, to overcome the reusability and maintainability issues of string payload.

        requestSpecification= RestAssured.given();
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
