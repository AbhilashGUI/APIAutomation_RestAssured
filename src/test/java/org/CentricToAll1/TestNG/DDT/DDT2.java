package org.CentricToAll1.TestNG.DDT;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DDT2
{

    RequestSpecification requestSpecification;
    ValidatableResponse validatableResponse;



    @Test(dataProvider = "getCredentials",dataProviderClass = UtilExcel2.class)

    public void testlogin(String Username,String Password)
    {
        System.out.println("Username-->"+Username);
        System.out.println("Password-->"+Password);

        String payload= "{\n" +
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









    }


}
