package com.rmgyantra.CRUD_withBDD;

import java.util.HashMap;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class PostTheProjectwithHashMapTest {
	@Test
	public void postTheProjectwithHashMap() {
	
		HashMap hp=new HashMap();
		hp.put("createdBy", "Mukundaa");
		hp.put("projectName", "Sai25998");
		hp.put("status", "Created");
		hp.put("teamSize", "10");
		
		given()
		.contentType(ContentType.JSON)
		.body(hp)
		.when()
		.post("http://localhost:8084/addProject")
		.then()
		.assertThat()
		.statusCode(201)
		.and()
		.assertThat()
		.contentType(ContentType.JSON)
		.log()
		.all();
	}
}
