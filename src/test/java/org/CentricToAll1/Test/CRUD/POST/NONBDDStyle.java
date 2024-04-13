package org.CentricToAll1.Test.CRUD.POST;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class NONBDDStyle


{

    @Test
    public void testNONBDDStylePositive()
    {
        String payload= "{\n" +
                "    \"username\":\"admin\",\n" +
                "    \"password\":\"password123\"\n" +
                "\n" +
                "}";

        RequestSpecification r= RestAssured
                //We are giving the baseURI&Path which is commonly resued.
                .given();
                r.baseUri("https://restful-booker.herokuapp.com");
                r.basePath("/auth");
                r.contentType(ContentType.JSON).log().all();
                r.body(payload);


                Response response= r.when().post();
      //We are storing when into the response to reuse

        ValidatableResponse validatableResponse=response.then();
      //We are storing then into the validatable response to reuse and extract the same
        String responseString= response.asString();
        System.out.println(responseString);     //It returns the token number

        validatableResponse.statusCode(200);


      //These response & Validatableresponse interfaces  is used to validate different aspects of the response.


    }



}
