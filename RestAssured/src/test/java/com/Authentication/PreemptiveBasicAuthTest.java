package com.Authentication;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class PreemptiveBasicAuthTest {
	@Test
	public void preeemptive()
	{
		given()
		.auth()
		.preemptive()
		.basic("rmgyantra", "rmgy@9999")
		.when()
		.get("http://localhost:8084/login")
		.then()
		.log()
		.all();	
	}
		
	}


