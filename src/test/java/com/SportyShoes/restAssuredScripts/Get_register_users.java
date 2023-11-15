package com.SportyShoes.restAssuredScripts;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Get_register_users {
	@Test
	public void get_all_users()
	{
		
		RestAssured.given()
		.baseUri("http://localhost:9010")
		.basePath("/get-users")
		.when()
		.get()
		.then()
		.statusCode(200)
		.log()
		.all();
		
	}

}
