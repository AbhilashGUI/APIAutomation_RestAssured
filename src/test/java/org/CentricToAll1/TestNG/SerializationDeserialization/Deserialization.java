package org.CentricToAll1.TestNG.SerializationDeserialization;

import com.google.gson.Gson;
import org.testng.annotations.Test;

public class Deserialization {

    @Test
    public void deserialization() {

        String jsonString = "{\n" +
                "              \"firstName\" : \"Abhilash\",\n" +
                "                \"lastName\" : \"Sharma\",\n" +
                "                \"gender\" : \"M\",\n" +
                "                \"age\" : 29,\n" +
                "                \"salary\" : 50000.00,\n" +
                "               \"married\" : false\n" +
                "}";



        Gson gson=new Gson();
        Employee employeeObject=gson.fromJson(jsonString,Employee.class);

        String firstname=employeeObject.getFirstName();
        String lastname=employeeObject.getLastName();
        String gender=employeeObject.getGender();
        Integer age=employeeObject.getAge();
        Double salary=employeeObject.getSalary();
        Boolean married=employeeObject.getMarried();

        System.out.println(jsonString);




    }
}