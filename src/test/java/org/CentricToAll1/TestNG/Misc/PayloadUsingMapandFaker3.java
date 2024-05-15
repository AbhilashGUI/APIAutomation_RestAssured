package org.CentricToAll1.TestNG.Misc;

import com.github.javafaker.Faker;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class PayloadUsingMapandFaker3
{
    RequestSpecification requestSpecification;
    ValidatableResponse validatableResponse;


    @Test
    public void testPostreq() {
        Map<String, Object> jsonbodyusingfakermap = new LinkedHashMap<>();
        Faker faker = new Faker();
        String name = faker.name().fullName();
        jsonbodyusingfakermap.put("firstname", faker.name().firstName());
        jsonbodyusingfakermap.put("lastname", faker.name().lastName());
        jsonbodyusingfakermap.put("totalprice", faker.random().nextInt(700));
        jsonbodyusingfakermap.put("depostpaid", faker.random().nextBoolean());

        Map<String, Object> bookingdates = new HashMap<>();
        bookingdates.put("checkin", "2024-06-07");
        bookingdates.put("checkout", "2024-06-09");

        jsonbodyusingfakermap.put("bookingdates", bookingdates);
        jsonbodyusingfakermap.put("additionalneeds", "Snacks");

        System.out.println(jsonbodyusingfakermap);

       
        requestSpecification=RestAssured.given();
        requestSpecification.baseUri("https://restful-booker.herokuapp.com");
        requestSpecification.basePath("/booking");
        requestSpecification.contentType(ContentType.JSON);
        requestSpecification.body(jsonbodyusingfakermap).log().all();



        Response response=requestSpecification.when().post();

        Integer bookingid=response.then().extract().path("bookingid");

        validatableResponse=response.then().log().all();
        validatableResponse.statusCode(200);

        System.out.println("bookingid-->"+bookingid);


    }



}
