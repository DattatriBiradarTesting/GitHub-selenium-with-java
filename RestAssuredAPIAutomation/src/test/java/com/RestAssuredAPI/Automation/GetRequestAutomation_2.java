package com.RestAssuredAPI.Automation;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetRequestAutomation_2 {

	@Test
	public void getRequestAutomation() {
		RestAssured.baseURI = "https://reqres.in/api/users";
		RestAssured.given().param("page", "2").when().get().then().assertThat().log().all().statusCode(200);

		System.out.println("-----------------------------------------");

		RestAssured.baseURI = "https://reqres.in/api/users";
		Response respose = RestAssured.given().param("page", "2").when().get();
		System.out.println(respose.getBody().asString());

	}

}
