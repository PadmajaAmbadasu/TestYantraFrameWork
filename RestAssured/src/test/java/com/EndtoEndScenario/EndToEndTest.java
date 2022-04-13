package com.EndtoEndScenario;
import static io.restassured.RestAssured.given;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import POJOLibrary.POJOClass;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import rmgyantraGenericLib.BaseAPIclass;
import rmgyantraGenericLib.EndPoints;
import rmgyantraGenericLib.javautilityLibrary;

public class EndToEndTest extends BaseAPIclass implements EndPoints {
	@Test
	public void EndToEnd() throws SQLException
	{
		javautilityLibrary jutil=new javautilityLibrary();
		baseURI="http://localhost";
		port=8084;
		
		POJOClass pc=new POJOClass("Mukundaa","name258258"+jutil.generateRandomNumber(),"Created",9);
		//Step:Create a Project
		
		 Response res = given()
		.contentType(ContentType.JSON)
		.body(pc)
	    .when().post(EndPoints.createProject);
		 res.prettyPrint();
		 
		//get the project
		 String projectid = res.jsonPath().get("projectId"); 
		 
		 given()
	     .pathParam("proID", projectid)
	     .when()
		.get("/projects/{proID}");
		 
	     
	     //get the project name
	    String name = res.jsonPath().get("projectName");
	   
	    
	    //connect to Database
			
	   ResultSet result = dutil.executeQueryTest("select *from project");
			while(result.next())
			{
				String actData = result.getString(4);
				if(actData.equals(name)) {
					System.out.println(name+"is present");
				}
			}
	    
	}

}
