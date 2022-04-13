package com.requestValidation;
import static io.restassured.RestAssured.*;

import java.util.List;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class DynamicResponceValidation {
	
	@Test
	public void dynamicTest()
	{
		String expData="TY_PROJ_203";
 Response resp = when().get("http://localhost:8084/projects");
		List<String> actData=resp.jsonPath().get("projectName");
		for(String act:actData)
		{
			if(act.equals(expData))
			{
				System.out.println(expData+"is available");
				break;
			}
		}
		
	}

}
