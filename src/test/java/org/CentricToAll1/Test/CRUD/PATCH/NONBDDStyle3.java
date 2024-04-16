package org.CentricToAll1.Test.CRUD.PATCH;


import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

public class NONBDDStyle3
{


    String payloadpatch= "{\n" +
            "    \"firstname\" : \"Shreyansh\",\n" +
            "    \"lastname\" : \"Sree\"\n" +
            "}\n";



    RequestSpecification requestSpecification;
    Response response;
    ValidatableResponse validatableResponse;
    String token="3d584c866d9665d";


    @Test
     public void testNONBDDStylePositive()
    {


        String payloadpatch="{\n" +
                "    \"firstname\" : \"Shreyansh\",\n" +
                "    \"lastname\" : \"Sree\"\n" +
                "}\n";




        requestSpecification= RestAssured.given();
        requestSpecification.baseUri("https://restful-booker.herokuapp.com");
        requestSpecification.basePath("booking/631");
        requestSpecification.contentType(ContentType.JSON);
        requestSpecification.cookie("token",token);
        requestSpecification.body(payloadpatch).log().all();



        Response response1=requestSpecification.when().patch();


        validatableResponse=response1.then().log().all();


       validatableResponse.statusCode(200);
       validatableResponse.body("firstname", Matchers.equalTo("Shreyansh"));
       validatableResponse.body("lastname",Matchers.equalTo("Sree"));




    }


}
