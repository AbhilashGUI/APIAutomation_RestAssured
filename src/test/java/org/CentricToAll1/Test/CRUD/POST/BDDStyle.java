package org.CentricToAll1.Test.CRUD.POST;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

public class BDDStyle
{


    @Test
    public void testBDDStylePositive()
    {
        //Since we are using a  post method and we require

        //Method: POST
        //URL: URI+Basepath
        //Headers:Content type
        //Payload: Body



          String payload= "{\n" +
                  "    \"username\":\"admin\",\n" +
                  "    \"password\":\"password123\"\n" +
                  "\n" +
                  "}";


          //Instead of using payload in automation framework. Hashmap and classes are also be used.
          //Classes are used 60-70%

        RestAssured
                .given()
                .baseUri("https://restful-booker.herokuapp.com")
                .basePath("/auth").contentType(ContentType.JSON).log().all()
                .body(payload).when().post().then().log().all().statusCode(200);


    }


}
//Note: Can create a new testngallanotations.xml file post every execution by deleting the existing one