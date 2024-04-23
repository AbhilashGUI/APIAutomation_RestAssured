package org.CentricToAll1.TestNG;


import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matchers;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.*;

public class TestNG003 {
    //Working on Put request for which we need Token Id and booking Id in advance


    RequestSpecification requestSpecification;
    ValidatableResponse validatableResponse;
    String token;

    @BeforeTest
    public void getToken() {
        requestSpecification = RestAssured.given();

        String payload = "{\n" +
                "    \"username\":\"admin\",\n" +
                "    \"password\":\"password123\"\n" +
                "\n" +
                "}";


        requestSpecification.baseUri("https://restful-booker.herokuapp.com");
        requestSpecification.basePath("/auth");
        requestSpecification.contentType(ContentType.JSON);
        requestSpecification.body(payload);
        Response response = requestSpecification.post();
        validatableResponse = response.then();

        //Matchers will be used by RA, very frequently
        validatableResponse.body("token", Matchers.notNullValue());


        //TestNG Assertions
        token = response.then().log().all().extract().path("token");
        Assert.assertNotNull(token);


        //AssertJ Assertions
        assertThat(token).isNotNull().isNotBlank().isNotEmpty();
        System.out.println(token);

    }
        @Test
        public void NONBDDStylePutRequest ()
        {
         String paylod="{\n" +
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

         requestSpecification=RestAssured.given();
         requestSpecification.baseUri("https://restful-booker.herokuapp.com/booking");
         requestSpecification.basePath("/8826");       //A
         requestSpecification.contentType(ContentType.JSON);
         requestSpecification.cookie("token",token);


         requestSpecification.body(paylod).log().all();


            // Invoking put method post which  we get response
            Response response=requestSpecification.when().put();

            validatableResponse=response.then().log().all();
            validatableResponse.statusCode(200);
            validatableResponse.body("firstname",Matchers.equalTo("Abhilash"));
            validatableResponse.body("lastname",Matchers.equalTo("Sharma"));



        }


    }

