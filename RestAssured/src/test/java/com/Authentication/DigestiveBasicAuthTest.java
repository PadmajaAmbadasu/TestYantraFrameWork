package com.Authentication;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class DigestiveBasicAuthTest {
	@Test
	
	public void digest()
	{
		given()
		.auth()
		.digest("rmgyantra", "rmgy@9999")
		.when()
		.get("http://localhost:8084/login")
		.then()
		.log()
		.all();	
	}
	

}
