package com.rmgyantra.parameters;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class GitHubParametersTest {
	@Test
	public void githubparameters() {
		
	given()
	.pathParam("username", "PadmajaAmbadasu")
	.queryParam("sort", "created")
	.when()
	.get("https://api.github.com/users/{username}/repos")
	.then()
	.log()
	.all();
		
	}

}
