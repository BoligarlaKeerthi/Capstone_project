package com.SportyShoes.restAssuredScripts;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Add_product {
	@Test
	public void add_new_product()
	{
		
		RestAssured.given()
		.baseUri("http://localhost:9010")
		.basePath("/add-shoe")
		.queryParam("id","101")
		.queryParam("image", "www.image.com")
		.queryParam("name","Nike")
		.queryParam("category", "Running")
		.queryParam("sizes","9")
		.queryParam("price", "2000")
		.when()
		.post()
		.then()
		.log().all();
		
}
	

}
