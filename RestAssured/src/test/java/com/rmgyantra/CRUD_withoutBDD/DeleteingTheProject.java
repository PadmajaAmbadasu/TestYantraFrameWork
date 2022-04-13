package com.rmgyantra.CRUD_withoutBDD;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class DeleteingTheProject 
{
	
	@Test
	
	public void deletingTheProject()
	{
		
   Response rsps= RestAssured.delete("http://localhost:8084/projects/TY_PROJ_001");
   
  ValidatableResponse vres = rsps.then();
  vres.assertThat().statusCode(204);
  vres.log().all();
  
  
	}
	
	
	
	
	
	
}
