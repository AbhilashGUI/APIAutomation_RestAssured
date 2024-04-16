package org.CentricToAll1.Test.CRUD.DELETE;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class NONBDDStyle4
{
    RequestSpecification requestSpecification;
    Response response;
    ValidatableResponse validatableResponse;
    String Token="1ea72b502c45cde";




    @Test
    public void testNONBDDStylePositive()
    {

        requestSpecification= RestAssured.given();
        requestSpecification.baseUri("https://restful-booker.herokuapp.com");
        requestSpecification.basePath("booking/858");
        requestSpecification.contentType(ContentType.JSON);
        requestSpecification.cookie("Token",Token);

        Response response1=requestSpecification.when().delete();


        validatableResponse=response1.then().log().all();


        validatableResponse.statusCode(201);




    }





}
