package com.omrbranch.stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC002_AddressStep {
	
//	Delete address
	@When("User adds request body with address id")
	public void userAddsRequestBodyWithAddressId() {
	}

	@When("User sends {string} request to DeleteAddress endpoint")
	public void userSendsRequestToDeleteAddressEndpoint(String string) {
	}

	@Then("User should verify the DeleteAddress response message matches {string}")
	public void userShouldVerifyTheDeleteAddressResponseMessageMatches(String string) {
	}

	
//	Get address
	@Given("User adds headers and bearer authorization for accessing get address endpoints")
	public void userAddsHeadersAndBearerAuthorizationForAccessingGetAddressEndpoints() {
	}

	@When("User sends {string} request to GetUserAddress endpoint")
	public void userSendsRequestToGetUserAddressEndpoint(String string) {
	}

	@Then("User should verify the GetUserAddress response message matches {string}")
	public void userShouldVerifyTheGetUserAddressResponseMessageMatches(String string) {
	}

	
//	updateAddress
	@When("User adds request body to update address {string},{string},{string},{string},{string},{string},{string},{string},{string},{string}")
	public void userAddsRequestBodyToUpdateAddress(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10) {
	}

	@When("User sends {string} request to updateUserAddress endpoint")
	public void userSendsRequestToUpdateUserAddressEndpoint(String string) {
	}

	@Then("User should verify the updateUserAddress response message matches {string}")
	public void userShouldVerifyTheUpdateUserAddressResponseMessageMatches(String string) {
	}

	
//	city list 
	@Given("User adds headers for CityList")
	public void userAddsHeadersForCityList() {
	}

	@When("User adds request body with state id for city list")
	public void userAddsRequestBodyWithStateIdForCityList() {
	}

	@When("User sends {string} request to CityList endpoint")
	public void userSendsRequestToCityListEndpoint(String string) {
	}

	@Then("User should verify the cityList response message matches {string} and save the city id")
	public void userShouldVerifyTheCityListResponseMessageMatchesAndSaveTheCityId(String string) {
	}

//	state
	@Given("User adds headers for StateList")
	public void userAddsHeadersForStateList() {
	}

	@When("User sends {string} request to StateList endpoint")
	public void userSendsRequestToStateListEndpoint(String string) {
	}

	@Then("User should verify the stateList response message matches {string} and save the state id")
	public void userShouldVerifyTheStateListResponseMessageMatchesAndSaveTheStateId(String string) {
	}

	

	@Given("User adds headers and bearer authorization for accessing address endpoints")
	public void userAddsHeadersAndBearerAuthorizationForAccessingAddressEndpoints() {
	}

	@When("User adds request body for add new address {string},{string},{string},{string},{string},{string},{string},{string},{string},{string}")
	public void userAddsRequestBodyForAddNewAddress(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10) {
	}

	@Then("User sends {string} request to addUserAddress endpoint")
	public void userSendsRequestToAddUserAddressEndpoint(String string) {
	}

	@Then("User should verify the addUserAddress response message matches {string} and save the address id")
	public void userShouldVerifyTheAddUserAddressResponseMessageMatchesAndSaveTheAddressId(String string) {
	}




}
