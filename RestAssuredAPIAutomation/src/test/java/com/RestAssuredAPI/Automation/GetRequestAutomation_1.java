package com.RestAssuredAPI.Automation;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetRequestAutomation_1 {

	@Test
	public void getRequestAutomation() {
		RestAssured.baseURI = "https://reqres.in/api/users";
		Response respose = RestAssured.given().param("page", "2").when().get();
		System.out.println("getStatusCode " + respose.getStatusCode());
		System.out.println("contentType " + respose.contentType());
		System.out.println("Time " + respose.getTime());
		System.out.println("Cookies " + respose.getCookies());
		System.out.println(respose.prettyPrint());

	}

}
