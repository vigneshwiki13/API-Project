package com.omrbranch.stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC003_ProfilePicture {
	

	@Given("User sets bearer authorization using the saved logtoken for profile picture endpoint")
	public void userSetsBearerAuthorizationUsingTheSavedLogtokenForProfilePictureEndpoint() {
	}

	@Given("User sets multipart request body with valid image file for profile update")
	public void userSetsMultipartRequestBodyWithValidImageFileForProfileUpdate() {
	}

	@When("User sends {string} request to the ChangeProfile endpoint")
	public void userSendsRequestToTheChangeProfileEndpoint(String string) {
	}

	@Then("User should verify the response message is {string}")
	public void userShouldVerifyTheResponseMessageIs(String string) {
	}




}
