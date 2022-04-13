package com.rmgyantra.CRUD_withBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class PatchProjectTest {
	
	@Test
	public void patchProject()
	{
		JSONObject jobj=new JSONObject();
		jobj.put("createdBy", "Samsung");
		given()
		.contentType(ContentType.JSON)
		
		.body(jobj)
		.when()
		.post("https://reqres.in/api/user/2")
		.then()
	    .assertThat()
	    .statusCode(201)
	    .log()
	    .all();
		
		
		
	}
	

}
