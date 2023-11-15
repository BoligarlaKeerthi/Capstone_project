package com.sportyshoe.CucumberScripts;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;

public class Steps {
	
	@When("I get all shoes from sportyshoe page")
	public void i_get_all_shoes_from_sportyshoe_page() {
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

	@Then("I list the  all registered users")
	public void i_list_the_all_registered_users() {
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

	@Then("I Add the product to cart")
	public void i_add_the_product_to_cart() {
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

	@Then("I Update the product")
	public void i_update_the_product() {
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

	@Then("I Delete the product")
	public void i_delete_the_product() {
		RestAssured.given()
		.baseUri("http://localhost:9010")
		.basePath("/delete-shoe")
		.queryParam("id", "101")
		.when().delete()
		.then().log().all();
		
	   
	}

}
