package com.rmgyantra.CRUD_withoutBDD;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class GettingTheProject {
	
	@Test
	public void gettingTheProject() 
	{
	 Response rsps = RestAssured.get("http://localhost:8084/projects");
		rsps.prettyPrint();
	//System.out.println(rsps.getContentType());
//	System.out.println(rsps.getHeaders());
	
		ValidatableResponse vres = rsps.then();
		vres.assertThat().statusCode(200);
		vres.log().all();
	}

}
