package com.rmgyantra.CRUD_withoutBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class PartialUpdate {
	
	@Test
	
	public void partialUpdate() {
		
		JSONObject jobj=new JSONObject();
		jobj.put("name", "PadmaMukund");
	//	jobj.put("projectName", "Pro4555");
		//jobj.put("status", "Created");
	//	jobj.put("teamSize", 5);
		
		RequestSpecification rspec = RestAssured.given();
		rspec.contentType(ContentType.JSON);
		rspec.body(jobj);
		
		Response rsps = rspec.patch("https://reqres.in/api/users/2");
		ValidatableResponse vres = rsps.then();
		vres.assertThat().statusCode(200);
		vres.log().all();
		
	}

}
