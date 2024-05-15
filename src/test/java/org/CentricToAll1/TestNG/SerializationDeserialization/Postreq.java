package org.CentricToAll1.TestNG.SerializationDeserialization;

import com.github.javafaker.Faker;
import com.google.gson.Gson;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.*;

public class Postreq
{
    RequestSpecification requestSpecification;
    ValidatableResponse validatableResponse;


    @Test
    public void testcase1()
    {
        // Step1 - POST
        // URL -> Base URI + base Path
        // HEADER
        // BODY
        // Auth - NO


        // Step 2
        // prepare the Payload ( Object -> JSON String)
        // send the request

        //Step 3
        // Validate Response ( JSON String -> Object)
        // FirstName,
        // Status Code
        // Time Response


       Faker faker=new Faker();
       booking booking=new booking();
       String randomfirstname=faker.name().firstName();


       booking.setFirstname(randomfirstname);
       booking.setLastname("Sharma");
       booking.setTotalprice(900);
       booking.setDepositpaid(true);

       bookingdates bookingdates=new bookingdates();
       bookingdates.setCheckin("2024-06-01");
       bookingdates.setCheckout("2024-06-10");
       booking.setBookingdates(bookingdates);
       booking.setAdditionalneeds("Brunch");

      

       //Gson Object -->jsonstring

        Gson gson=new Gson();
        String jsonstringbooking=gson.toJson(booking);
        System.out.println(jsonstringbooking);



        requestSpecification= RestAssured.given();
        requestSpecification.baseUri("https://restful-booker.herokuapp.com");
        requestSpecification.basePath("/booking");
        requestSpecification.contentType(ContentType.JSON);
        requestSpecification.body(jsonstringbooking).log().all();


        Response response=requestSpecification.when().post();
        String jsonresponsestring=response.asString();

        validatableResponse=response.then().log().all();
        validatableResponse.statusCode(200);

        //Validate response(JsonString -->Object)
        bookingresponse bookingresponseObject=gson.fromJson(jsonresponsestring, bookingresponse.class);


        assertThat(bookingresponseObject.getBookingid()).isNotNull();
        assertThat(bookingresponseObject.getBooking().getFirstname()).isEqualTo(randomfirstname);













    }



}
