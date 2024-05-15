package org.CentricToAll1.TestNG.Misc;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class PayloadUsingMap
{
    RequestSpecification requestSpecification;
    ValidatableResponse validatableResponse;


    @Test
    public void testPostreq() {
        /*** String payload concept is used 10%
         String payload = "{\n" +
                "    \"firstname\" : \"Jim\",\n" +
                "    \"lastname\" : \"Brown\",\n" +
                "    \"totalprice\" : 111,\n" +
                "    \"depositpaid\" : true,\n" +
                "    \"bookingdates\" : {\n" +
                "        \"checkin\" : \"2024-03-19\",\n" +
                "        \"checkout\" : \"2024-06-20\"\n" +
                "    },\n" +
                "    \"additionalneeds\" : \"Breakfast\"\n" +
                "}"***/


        ///Note: Jsonpayload can be converted to map. Map concept is used 10-15%

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




    }


}