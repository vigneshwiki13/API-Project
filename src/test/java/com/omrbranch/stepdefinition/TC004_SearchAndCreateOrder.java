package com.omrbranch.stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC004_SearchAndCreateOrder {
	
//verify cart already empty
	@Given("User sets bearer authorization for ClearCart endpoint")
	public void userSetsBearerAuthorizationForClearCartEndpoint() {
	}

	@When("User sends {string} request to the ClearCart endpoint")
	public void userSendsRequestToTheClearCartEndpoint(String string) {
	}

	@Then("Verify the ClearCart response message is {string}")
	public void verifyTheClearCartResponseMessageIs(String string) {
	}
	
//	search for product and save category/product ids
	

	@Given("User sets headers for SearchProduct")
	public void userSetsHeadersForSearchProduct() {
	}

	@When("User sets request body to search for product {string}")
	public void userSetsRequestBodyToSearchForProduct(String string) {
	}

	@When("User sends {string} request to the SearchProduct endpoint")
	public void userSendsRequestToTheSearchProductEndpoint(String string) {
	}

	@Then("Verify the search result includes product name {string} and Save the category ID and product ID from response")
	public void verifyTheSearchResultIncludesProductNameAndSaveTheCategoryIDAndProductIDFromResponse(String string) {
	}
	
	
//	Retrieve product

	@Given("User sets bearer authorization for GetSearchProductList endpoint")
	public void userSetsBearerAuthorizationForGetSearchProductListEndpoint() {
	}

	@When("User sets request body with saved product ID")
	public void userSetsRequestBodyWithSavedProductID() {
	}

	@When("User sends {string} request to the GetSearchProductList endpoint")
	public void userSendsRequestToTheGetSearchProductListEndpoint(String string) {
	}

	@Then("Verify the response includes product with specification {string} and save the variant ID")
	public void verifyTheResponseIncludesProductWithSpecificationAndSaveTheVariantID(String string) {
	}

//	Add searched product to cart
	

	@Given("User sets bearer authorization for AddToCart endpoint")
	public void userSetsBearerAuthorizationForAddToCartEndpoint() {
	}

	@When("User sets request body using saved variant ID")
	public void userSetsRequestBodyUsingSavedVariantID() {
	}

	@When("User sends {string} request to the AddToCart endpoint")
	public void userSendsRequestToTheAddToCartEndpoint(String string) {
	}

	@Then("Verify the AddToCart response message is {string}")
	public void verifyTheAddToCartResponseMessageIs(String string) {
	}
//	get user cart and save cart idD

	@Given("User sets bearer authorization for GetCart endpoint")
	public void userSetsBearerAuthorizationForGetCartEndpoint() {
	}

	@When("User sends {string} request to the GetCart endpoint")
	public void userSendsRequestToTheGetCartEndpoint(String string) {
	}

	@Then("Verify the GetCart response message is {string} Save the cart ID")
	public void verifyTheGetCartResponseMessageIsSaveTheCartID(String string) {
	}
	
//	Set address for checkout

	@Given("User sets bearer authorization for SetAddress endpoint")
	public void userSetsBearerAuthorizationForSetAddressEndpoint() {
	}
	
	@When("User sets request body with saved address ID and cart ID")
	public void userSetsRequestBodyWithSavedAddressIDAndCartID() {
	}

	@When("User sends {string} request to the SetAddress endpoint")
	public void userSendsRequestToTheSetAddressEndpoint(String string) {
	}

	@Then("Verify the SetAddress response message is {string}")
	public void verifyTheSetAddressResponseMessageIs(String string) {
	}

//	create order with payment

	@Given("User sets bearer authorization for CreateOrder endpoint")
	public void userSetsBearerAuthorizationForCreateOrderEndpoint() {
	}

	@When("User sets request body to create order with payment details {string}, {string}, {string}, {string}, {string}, {string}")
	public void userSetsRequestBodyToCreateOrderWithPaymentDetails(String string, String string2, String string3, String string4, String string5, String string6, io.cucumber.datatable.DataTable dataTable) {
	}

	@When("User sends {string} request to the CreateOrder endpoint")
	public void userSendsRequestToTheCreateOrderEndpoint(String string) {
	}

	@Then("Verify the CreateOrder response message is {string}")
	public void verifyTheCreateOrderResponseMessageIs(String string) {
	}



	

















}
