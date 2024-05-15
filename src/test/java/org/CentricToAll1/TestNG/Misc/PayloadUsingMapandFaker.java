package org.CentricToAll1.TestNG.Misc;

import com.github.javafaker.Faker;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class PayloadUsingMapandFaker
{
 RequestSpecification requestSpecification;
 ValidatableResponse validatableResponse;

 @Test
    public void testPostreq()
 {
     Map<String,Object> jsonbodyusingfakermap=new HashMap<>();
     Faker faker=new Faker();
     String name=faker.name().fullName();
     jsonbodyusingfakermap.put("firstname",faker.name().firstName());
     jsonbodyusingfakermap.put("lastname",faker.name().lastName());
     jsonbodyusingfakermap.put("totalprice",faker.random().nextInt(1000));
     jsonbodyusingfakermap.put("depositpaid",faker.random().nextBoolean());

     Map<String,Object> bookingdates=new HashMap<>();
     bookingdates.put("checkin","2024-06-07");
     bookingdates.put("checkout","2024-06-09");

     jsonbodyusingfakermap.put("bookingdates",bookingdates);
     jsonbodyusingfakermap.put("additionalneeds","Brunch");

     System.out.println(jsonbodyusingfakermap);







 }





}
