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

public class TestNG006
{
    String token;
    Integer bookingId;
    RequestSpecification requestSpecification;
    ValidatableResponse validatableResponse;



    @BeforeTest
    public void getToken()
    {
        System.out.println("-get token-");

        requestSpecification= RestAssured.given();
        String payload="{\n" +
                "    \"username\":\"admin\",\n" +
                "    \"password\":\"password123\"\n" +
                "\n" +
                "}";
        requestSpecification.baseUri("https://restful-booker.herokuapp.com");
        requestSpecification.basePath("/auth");
        requestSpecification.contentType(ContentType.JSON);
        requestSpecification.body(payload);
        Response response=requestSpecification.when().post();
        validatableResponse=response.then();

        validatableResponse.body("token", Matchers.notNullValue());

        token=response.then().log().all().extract().path("token");
        Assert.assertNotNull(token);
    }

    @BeforeTest
    public void getBookingId() {
        System.out.println("-getBooking Id");
        requestSpecification = RestAssured.given();

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
                "}";


        requestSpecification.baseUri("https://restful-booker.herokuapp.com");
        requestSpecification.basePath("/booking");
        requestSpecification.contentType(ContentType.JSON);
        requestSpecification.body(payload);


        Response response = requestSpecification.when().post();

        ValidatableResponse validatableResponse = response.then();
        String responseString = response.asString();
        System.out.println(responseString);
        validatableResponse.statusCode(200);

        bookingId = response.then().log().all().extract().path("bookingid");
        System.out.println(bookingId);


    }

    @Test
    public void testPutRequest()
    {
        //tokenId and bookingId
        System.out.println("-Test case Put request-");

        String payload="{\n" +
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
                 requestSpecification.baseUri("https://restful-booker.herokuapp.com");
                 requestSpecification.basePath("booking/"+bookingId);
                 requestSpecification.contentType(ContentType.JSON);
                 requestSpecification.cookie("token",token);
                 requestSpecification.body(payload).log().all();

                 Response response=requestSpecification.when().put();
                 validatableResponse= response.then().log().all();

                 validatableResponse.statusCode(200);

                 validatableResponse.body("firstname",Matchers.equalTo("Abhilash"));
                 validatableResponse.body("lastname",Matchers.equalTo("Sharma"));




    }


}
