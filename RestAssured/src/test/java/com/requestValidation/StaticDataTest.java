package com.requestValidation;

import org.junit.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import io.restassured.response.Response;

public class StaticDataTest {
	@Test
	public  void staticDataTest() {
		String expData="rmgProject";

		Response resp = when().get("http://localhost:8084/projects");
		String actData = resp.jsonPath().get("[2].projectName");
		
		Assert.assertEquals(expData, actData);
		
	}
	}


	
