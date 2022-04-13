package com.POJO;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import POJOLibrary.POJOClass;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class POJOtest {

	@Test(dataProvider="provideData")

public void POJOtest(String createdBy, String projectName, String status, int teamSize)
{
	POJOClass pc=new POJOClass(createdBy, projectName,status,teamSize);
	
	given()
	.contentType(ContentType.JSON)
	.body(pc)
	.when()
	.post("http://localhost:8084/addProject")
	.then()
	.log()
	.all();
	}
@DataProvider
public Object[][] provideData()
{
	Object[][] obj=new Object[2][4];
	
	obj[0][0]="padma";
	obj[0][1]="rmg33";
	obj[0][2]="yanta";
	obj[0][3]="23";
	
	obj[1][0]="padma12";
	obj[1][1]="rmg3345";
	obj[1][2]="yantaaa";
	obj[1][3]="234";
	return obj;
	
	}
}


