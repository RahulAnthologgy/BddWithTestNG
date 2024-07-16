package rest;


import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class TestRest {
@Test
    void test_01_get(){
    given().get("https://reqres.in/api/users?page=2")
            .then().statusCode(200);

}
}
