package com.rmgyantra.CRUD_withBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class PutComepleteUpdateTest {
	
	@Test
	public void putCompleteTest() {
		
		JSONObject jobj=new JSONObject();
	
		jobj.put("createdBy", "Mukunda");
		jobj.put("projectName", "Mukunda25778");
		jobj.put("status", "Created");
		jobj.put("teamSize", "25");
		
		given()
		.contentType(ContentType.JSON)
		.body(jobj)
		.when()
		.post("http://localhost:8084/addProject")
		.then()
		.assertThat()
		.statusCode(201)
		.log()
		.all();
		
		
		
		
	}
	

}
