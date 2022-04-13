package com.Authentication;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class BerearTokenTest {
	
	
@Test
public void berearToken()
{
 given()
 .auth()
 .oauth2("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")
 .when()
 .get("https://api.github.com/user/repos")
 .then()
 .log()
 .all();

}
}