package com.rmgyantra.CRUD_withoutBDD;

import org.json.simple.JSONObject;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class CreatingTheProject {
	
	@Test
	
	public void creatingTheProject() {
		
		JSONObject jobj=new JSONObject();
		jobj.put("createdBy", "Mukund");
		jobj.put("projectName", "Pro45");
		jobj.put("status", "Created");
		jobj.put("teamSize", 5);
		
		RequestSpecification rspec = RestAssured.given();
		rspec.contentType(ContentType.JSON);
		rspec.body(jobj);
		
		Response rsps = rspec.post("http://localhost:8084/addProject");
		ValidatableResponse vres = rsps.then();
		vres.assertThat().statusCode(201);
		vres.log().all();
		
		
		
		
	}

}
