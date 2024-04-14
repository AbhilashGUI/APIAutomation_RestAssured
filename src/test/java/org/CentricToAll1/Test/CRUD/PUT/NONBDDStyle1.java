package org.CentricToAll1.Test.CRUD.PUT;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

public class NONBDDStyle1
{


     RequestSpecification requestSpecification;
     ValidatableResponse validatableResponse;
     String token="49eb4d8a73c52a8";



    @Test
    public void testNONBDDStylePositive()
    {

         //Url
        //Auth-token, headers:json
        //Id:XXX
        //Payload


        String payload= "{\n" +
                "    \"firstname\" : \"Abhilash\",\n" +
                "    \"lastname\" : \"Sharma\",\n" +
                "    \"totalprice\" : 111,\n" +
                "    \"depositpaid\" : true,\n" +
                "    \"bookingdates\" : {\n" +
                "        \"checkin\" : \"2024-03-19\",\n" +
                "        \"checkout\" : \"2024-06-20\"\n" +
                "    },\n" +
                "    \"additionalneeds\" : \"Breakfast\"\n" +
                "}";

        requestSpecification = RestAssured.given();
        requestSpecification.baseUri("https://restful-booker.herokuapp.com/");
        requestSpecification.basePath("booking/914");
        requestSpecification.contentType(ContentType.JSON);
        requestSpecification.cookie("token",token);

        requestSpecification.body(payload).log().all();



        // Calling PUT method on URI. After hitting we get Response
       Response response = requestSpecification.when().put();




        // Get Validatable response to perform validation
        validatableResponse = response.then().log().all();


        validatableResponse.statusCode(200);
        validatableResponse.body("firstname", Matchers.equalTo("Abhilash"));
        validatableResponse.body("lastname", Matchers.equalTo("Sharma"));




    }


}
