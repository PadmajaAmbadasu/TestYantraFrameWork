package com.Authentication;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class OAuth2Test {
   	@Test
	public void oauth()
	{
		Response rsps = given()
		.formParam("client_id", "Padmaja")
		.formParam("client_secret", "f340dd25f4f96040183b3414d69b0979")
		.formParam("grant_type", "client_credentials")
		.formParam("redirect_uri", "https:example.com")
		.when()
		.post("http://coop.apps.symfonycasts.com/token");
		//.prettyPrint();
		String token = rsps.jsonPath().get("access_token");
		System.out.println(token);
		
		given()
		.auth().oauth2(token)
		.pathParam("USER_ID", "3032")
		.when()
		.post("http://coop.apps.symfonycasts.com/api/{USER_ID}/eggs-collect")
		.then()
		.log()
		.all();
}
}
