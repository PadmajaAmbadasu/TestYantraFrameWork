package com.rmgyantra.CRUD_withBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class PostTheProjectTest {
	@Test
	public void postTheProject() {
		
		JSONObject jobj=new JSONObject();
		jobj.put("createdBy", "Mukunda");
		jobj.put("projectname", "Mukunda258");
		jobj.put("status", "Created");
		jobj.put("teamSize", "9");
		
		given()
		.contentType(ContentType.JSON)
		.body(jobj)
		.when()
		.post("http://localhost:8084/addProject")
		.then()
		
		.assertThat()
		.statusCode(201);

	}

}
