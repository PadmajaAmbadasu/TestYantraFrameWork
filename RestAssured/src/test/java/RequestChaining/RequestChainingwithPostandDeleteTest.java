package RequestChaining;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.util.HashMap;

public class RequestChainingwithPostandDeleteTest {
	@Test
	public void requestChaining()
	{
		HashMap hp=new HashMap();
	   hp.put("createdBy", "Pad");
	   hp.put("projectName", "pq258");
	   hp.put("status", "Created");
	   hp.put("teamSize", 10);
	   given()
	   .contentType(ContentType.JSON)
	   .body(hp);
	   Response res = when().post("http://localhost:8084/addProject");
	   
	   
	   
	   
		     
		
		
	}

}
