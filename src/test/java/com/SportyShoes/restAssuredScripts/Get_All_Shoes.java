package com.SportyShoes.restAssuredScripts;



import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Get_All_Shoes {
	
	@Test
	public void get_all_shoes()
	{
		RestAssured.given()
		.baseUri("http://localhost:9010")
		.basePath("/get-shoes")
		.when()
		.get()
		.then()
		.statusCode(200)
		.log()
		.all();
	}

}

