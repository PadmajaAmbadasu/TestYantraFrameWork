package com.HamcrestMatchers;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

import java.util.concurrent.TimeUnit;

public class HamcrestmatchesTest {
	@Test
	
	public void hamcrestmatches()
	{
		when()
		.get("http://localhost:8084/projects")
		.then()
		.assertThat().time(Matchers.lessThan(5000L),TimeUnit.MILLISECONDS)
		.assertThat().body("[1].projectId",Matchers.equalTo("TY_PROJ_1402"))
		.log()
		.all();
	}

}
