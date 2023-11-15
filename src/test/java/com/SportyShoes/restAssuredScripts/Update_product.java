package com.SportyShoes.restAssuredScripts;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Update_product {
@Test
	public void update_a_product()
	{
		
		RestAssured.given()
		.baseUri("http://localhost:9010")
		.basePath("/update-shoe")
		.queryParam("id","101")
		.queryParam("image", "www.imge123.com")
		.queryParam("name","Reebok")
		.queryParam("category", "walking")
		.queryParam("sizes","8,9,10")
		.queryParam("price", "1500")
		.when()
		.put()
		.then()
		
		.log().all()
		;
		
}
}
