package org.CentricToAll1.TestNG.SerializationDeserialization;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.testng.annotations.Test;

public class Serialization
{

    //Serialization : Is a process of converting object/classes into a json string

//            {
//                "firstName" : "Abhilash",
//                "lastName" : "Sharma",
//                "gender" : "M",
//                "age" : 29,
//                "salary" : 50000.00,
//                "married" : false
//        }


    @Test
    public void test()
    {
        //Create employee object

       Employee employeeObject=new Employee();
       employeeObject.setFirstName("Abhilash");
       employeeObject.setLastName("Sharma");
       employeeObject.setGender("M");
       employeeObject.setAge(29);
       employeeObject.setSalary(50000.00);
       employeeObject.setMarried(false);


       //Create Gson Object

        Gson gson=new Gson();
        String jsonEmployee=gson.toJson(employeeObject);
        System.out.println(jsonEmployee);


        Gson gsonBuilder = new GsonBuilder().setPrettyPrinting().create();
        String employeeJsonSringUsingJsonBuilder = gsonBuilder.toJson(employeeObject);
        System.out.println("Pretty JSON String :- ");
        System.out.println(employeeJsonSringUsingJsonBuilder);

    }





}
