package RequestChaining;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class RequestChainingTest {
	
	@Test
	public void requestChaining() {
		
		Response resp = when().get("http://localhost:8084/projects");
				
				String projectid = resp.jsonPath().get("[1].projectId");
		        System.out.println(projectid);
				
				given()
				.pathParam("proIDD", projectid)
				.when()
				.delete("http://localhost:8084/projects/{proIDD}")
				.then()
				.assertThat()
				.statusCode(204);
				
	}
	
}
