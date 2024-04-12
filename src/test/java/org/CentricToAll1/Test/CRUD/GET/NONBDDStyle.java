package org.CentricToAll1.Test.CRUD.GET;


import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class NONBDDStyle
{

    //Note: We will be using the NON-BDDstyle for API_Automation

public static void main(String[] args)
{

    RequestSpecification r= RestAssured.given();

    r.baseUri("https://restful-booker.herokuapp.com");
    r.basePath("/booking/649");
    r.when().log().all()
            .get();
    r.then().log().all().statusCode(200);


//Testing Framework : Allow us to executed multiple test cases
    //1 Main function: It will executed all the listed testcases.

}


}



//Note:In the result , we are response payload/body is seen as empty. Suspect that instant deletion of dummy API's


