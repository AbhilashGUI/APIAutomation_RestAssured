package org.CentricToAll1.Test.CRUD.GET;

import io.restassured.RestAssured;
import io.restassured.response.ValidatableResponse;

public class BDDStyle
{

    public static void main(String args[])
    {


        RestAssured
                .given()
                .baseUri("https://restful-booker.herokuapp.com")
                .basePath("/booking/4464").log().all()


                .when().get()

                .then().log().all().statusCode(201);


    }

}


//Note:In the result, the response payload/body is seen as empty. Suspecting  that instant deletion of dummy API's