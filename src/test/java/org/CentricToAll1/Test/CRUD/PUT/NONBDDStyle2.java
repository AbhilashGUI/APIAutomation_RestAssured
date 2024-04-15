package org.CentricToAll1.Test.CRUD.PUT;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

public class NONBDDStyle2
{
    RequestSpecification requestSpecification;
    Response response;
    ValidatableResponse validatableResponse;
    String token="8ff65d380a41b52";

    @Test
    public void testNONBDDStyleNegative()
    {

        //Url
        //Auth-token, headers:json
        //Id:XXX
        //Payload


        String payload= "{\n" +
                "    \"firstname\" : \"Jim\",\n" +
                "    \"lastname\" : \"Brown\",\n" +
                "    \"totalprice\" : 111,\n" +
                "    \"depositpaid\" : true,\n" +
                "    \"bookingdates\" : {\n" +
                "        \"checkin\" : \"2024-03-19\",\n" +
                "        \"checkout\" : \"2024-06-20\"\n" +
                "    },\n" +
                "    \"additionalneeds\" : \"Breakfast\"\n" +
                "}";



         requestSpecification= RestAssured.given();
         requestSpecification.baseUri("https://restful-booker.herokuapp.com");
         requestSpecification.basePath("booking/5044");
         requestSpecification.contentType(ContentType.JSON);
         requestSpecification.cookie("token",token);
         requestSpecification.body(payload).log().all();


        // Calling PUT method on URI. After hitting we get Response
         Response response1= requestSpecification.when().put();



        // Get Validatable response to perform validation
         validatableResponse=response1.then().log().all();


        validatableResponse.statusCode(200);
        validatableResponse.body("firstname",Matchers.equalTo("Vemula"));
        validatableResponse.body("lastname", Matchers.equalTo("Abhilash"));



    }




}
