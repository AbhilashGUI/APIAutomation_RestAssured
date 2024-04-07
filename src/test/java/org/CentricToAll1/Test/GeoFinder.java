package org.CentricToAll1.Test;

import io.restassured.RestAssured;

public class GeoFinder
{
     public static void main(String args[]) {


          //GET Request: https://api.zippopotam.us/IN/500030 and GET Method
          //URL
          //HEADER
          //Base Url: https://api.zippopotam.us
          //Base Path: /IN/500030
          //Payload: Not required
          //RESPONSE: Status code, Response body, Time, Headers and cookies


          //Gerkin --> Given, When, Then and these are the BDD style
          //BDD is a framework and it uses a syntax called GERKIN
          //Non BDD framework and can use a Gerkin syntax.

          //given(): Just like a pre-requisite before testing the API
          //when():Test data required during execution
          //then():Post testing, validation of response.


          RestAssured
                  .given()
                  .baseUri("https://api.zippopotam.us").basePath("/IN/500030")

                  .when()
                  .get()

                  .then().statusCode(200);



     }


}
