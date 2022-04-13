package com.rmgyantra.CRUD_withBDD;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class getProjectTest {
	
	@Test
	public void GetProjectTest() 
	{
		when()
		.get("http://localhost:8084/projects")
		.then()
		.assertThat().statusCode(200)
		.log().all();
	}
}

