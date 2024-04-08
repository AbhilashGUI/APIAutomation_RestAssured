package org.CentricToAll1.Test;

import io.restassured.RestAssured;

public class GeoFinder1
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
  //Url is a combination of URI+Path

                .when().log().all()
                .get()

                .then().log().all().statusCode(200);
        //Manipulate the status code as per need

// log(). all() needs to be added post given() section. This will print the response body regardless if an error occurred. given().
    }

    }
