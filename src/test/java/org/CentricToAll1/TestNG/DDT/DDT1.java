package org.CentricToAll1.TestNG.DDT;


import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.swing.*;

public class DDT1 {

    RequestSpecification requestSpecification;
    ValidatableResponse validatableResponse;
    Integer id;
    Integer statuscode;

    @Test(dataProvider = "getCredentials",dataProviderClass = UtilExcel1.class)
     public  void testlogin(String Username, String Password)
    {
        System.out.println("Username-->"+Username);
        System.out.println("Password-->"+Password);

     String payload = "{\n" +
             "  \"username\": \"\",\n" +
             "  \"password\": \"\",\n" +
             "  \"remember\": false,\n" +
             "  \"recaptcha_response_field\": \"\"\n" +
             "}";

      requestSpecification= RestAssured.given();
      requestSpecification.baseUri("https://app.vwo.com/");
      requestSpecification.basePath("/login");
      requestSpecification.contentType(ContentType.JSON);
      requestSpecification.body(payload);
      Response response=requestSpecification.when().post();
      validatableResponse=response.then().log().all();

      id=validatableResponse.extract().path("id");
      System.out.println(id);

      //id should not be null
        Assert.assertNotNull(id);
        Assert.assertEquals(statuscode,200);
        statuscode=validatableResponse.extract().statusCode();
        System.out.println(statuscode);




     }



}
