package com.rmgyantra.CRUD_withBDD;

import static io.restassured.RestAssured.when;

import org.testng.annotations.Test;

public class DeleteTheProjectTest {
	@Test
	public void deleteTheProjectTest() {
		when()
		.delete("http://localhost:8084/projects/TY_PROJ_1002")
		.then()
		.assertThat().statusCode(204)
		.log().all();
		
	}

}
