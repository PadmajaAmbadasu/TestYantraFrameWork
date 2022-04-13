package com.rmgyantra.parameters;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class PathParametersTest {
	@Test
	public void pathParameterTest()
	{

		given()
		.pathParam("proID", "TY_PROJ_204")
		.when()
		.get("http://localhost:8084/projects/{proID}")
		.then()
		.log()
		.all();	
		
	}

}
