package com.rmgyantra.CRUD_withBDD;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.io.File;

public class PostTheProjectwithJSONFileTest {
	@Test
	public void postTheProject()
	{
		File f= new File("./JsonFile.json");
		given()
		.contentType(ContentType.JSON)
		.body(f)
		.when()
		.post("http://localhost:8084/addProject")
		.then()
		.assertThat()
		.statusCode(201);
		
		
	}

}
