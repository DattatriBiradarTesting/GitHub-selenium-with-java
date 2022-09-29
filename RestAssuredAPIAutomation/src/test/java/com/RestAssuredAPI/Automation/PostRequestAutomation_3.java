package com.RestAssuredAPI.Automation;

import org.testng.annotations.Test;
import io.restassured.RestAssured;

public class PostRequestAutomation_3 {

	@Test
	public void postRequestAutomation() {
		RestAssured.baseURI = "https://reqres.in/api/users";
		RestAssured.given().body("{\r\n"
				+ "    \"name\": \"vinayak\",\r\n"
				+ "    \"job\": \"Testing\"\r\n"
				+ "}").post()
		.then()
		.log()
		.all()
		.assertThat()
		.statusCode(201);
		
		System.out.println("_________________________________________________________");
		
		RestAssured.baseURI="https://reqres.in/api/users";
		String json="{\r\n"
				+ "    \"name\": \"morpheus\",\r\n"
				+ "    \"job\": \"leader\"\r\n"
				+ "}";
		RestAssured.given().body(json)
		.post()
		.then()
		.log()
		.all()
		.assertThat()
		.statusCode(201);
		
	}
}
