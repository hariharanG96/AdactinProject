package com.adactin.stepdefenition;

import org.openqa.selenium.WebDriver;

import com.adactin.helper.FileReaderManager;
import com.adactin.helper.PageObjectManager;
import com.adactin.runner.Runner;
import com.baseclass.org.BaseClass;

import cucumber.api.java.en.*;
import junit.framework.Assert;


public class StepDefenitionFile extends BaseClass {

	public static WebDriver driver = Runner.driver;
	public static PageObjectManager pom = new PageObjectManager(driver);

	
	@Given("Refresh the page")
	public void refresh_the_page() {
		System.out.println("Refresh");
	}

	@Given("User launch login page in the addactin web application")
	public void user_launch_login_page_in_the_addactin_web_application() throws Throwable {
		getUrlBC(FileReaderManager.getFRM().getObjectCR().urlLaunch());
	}

	@When("^User enter the valid username \"([^\"]*)\" in username field$")
	public void user_enter_the_valid_username_in_username_field(String string) {
		inputValueElementBC(pom.getLp().getUsername(), string);
	}

	@When("^User enter the valid password \"([^\"]*)\" in password field$")
	public void user_enter_the_valid_password_in_password_field(String string) {
		inputValueElementBC(pom.getLp().getPassword(), string);
	}

	@Then("User click on the login button and verfiy the home page was loged in succesfully")
	public void user_enter_the_login_button_and_verfiy_the_home_page_was_loged_in_succesfully() {
		clickOnElementBC(pom.getLp().getLoginBtn());
	}

	@When("User select the location of the hotel")
	public void user_select_the_location_of_the_hotel() {
		selectOptionsBC(pom.getHs().getLocation(), "Adelaide", "byVisibletext");
	}

	@When("User select the hotel in the hotels list")
	public void user_select_the_hotel_in_the_hotels_list() {
		selectOptionsBC(pom.getHs().getHotels(), "Hotel Cornice", "byVisibletext");
	}

	@When("User select the room type from the list")
	public void user_select_the_room_type_from_the_list() {
		selectOptionsBC(pom.getHs().getRoomType(), "Standard", "byVisibletext");

	}

	@When("User select the no of rooms")
	public void user_select_the_no_of_rooms() {
		selectOptionsBC(pom.getHs().getRoomNo(), "2 - Two", "byVisibletext");

	}

	@When("User enter the date of Check-In")
	public void user_enter_the_date_of_Check_In() {
		inputValueElementBC(pom.getHs().getDateIn(), "24/02/2020");
	}

	@When("User enter the Check-Out Date")
	public void user_enter_the_Check_Out_Date() {
		inputValueElementBC(pom.getHs().getDateOut(), "25/02/2020");
	}

	@When("User select the Adult count in the Adult per room field")
	public void user_select_the_Adult_count_in_the_Adult_per_room_field() {
		selectOptionsBC(pom.getHs().getAdultsCount(), "1 - One", "byVisibletext");
	}

	@When("User select the Children count")
	public void user_select_the_Children_count() {

	}

	@Then("User click on the Search button and verify the hotel list displayed as per our search criteria")
	public void user_click_on_the_Search_button_and_verify_the_hotel_list_displayed_as_per_our_search_criteria() {
		clickOnElementBC(pom.getHs().getSearch());
	}

	@When("User select the hotel from the list")
	public void user_select_the_hotel_from_the_list() {
		clickOnElementBC(pom.getShp().getRadioBtn());
	}

	@Then("User click on the Continue button")
	public void user_click_on_the_Continue_button() {
		clickOnElementBC(pom.getShp().getContinueBtn());
	}

	@When("^User enter the firstname \"([^\"]*)\" in First Name field$")
	public void user_enter_the_firstname_in_First_Name_field(String string) {
		inputValueElementBC(pom.getBp().getFirstName(), string);
	}

	@When("^User enter the lastname \"([^\"]*)\" in Last Name field$")
	public void user_enter_the_lastname_in_Last_Name_field(String string) {
		inputValueElementBC(pom.getBp().getLastName(), string);
	}

	@When("^User enter the valid billing address \"([^\"]*)\" in Billing Address field$")
	public void user_enter_the_valid_billing_address_in_Billing_Address_field(String string) {
		inputValueElementBC(pom.getBp().getAddress(), string);
	}

	@When("^User enter the sixteen digit valid credit card number \"([^\"]*)\" in Credit Card No field$")
	public void user_enter_the_sixteen_digit_valid_credit_card_number_in_Credit_Card_No_field(String string) {
		inputValueElementBC(pom.getBp().getCreditCardNumber(), string);
	}

	@When("^User select the type of the credit card \"([^\"]*)\" in Credit Card Type field$")
	public void user_select_the_type_of_the_credit_card_in_Credit_Card_Type_field(String string) {
		selectOptionsBC(pom.getBp().getCreditCardType(), string, "byvisibletext");
	}

	@When("^User select the expiry month \"([^\"]*)\" in card from Expiry Date field$")
	public void user_select_the_expiry_month_in_card_from_Expiry_Date_field(String string) {
		selectOptionsBC(pom.getBp().getExpMonth(), string, "byvisibletext");
	}

	@When("^User select the expiry year \"([^\"]*)\" in card from Expiry Date field$")
	public void user_select_the_expiry_year_in_card_from_Expiry_Date_field(String string) {
		selectOptionsBC(pom.getBp().getExpYear(), string, "byvisibletext");
	}
	@When("^User enter the valid cvv number \"([^\"]*)\" in CVV Number field$")
	public void user_enter_the_valid_cvv_number_in_CVV_Number_field(String string) {
		inputValueElementBC(pom.getBp().getCvvNumber(), "0000");
	}

	@Then("^User click on the Book Now button and verify the details in booking confirmation with the actual given details$")
	public void user_click_on_the_Book_Now_button_and_verify_the_details_in_booking_confirmation_with_the_actual_given_details() {
		clickOnElementBC(pom.getBp().getBookBtn());
	}

	@Then("^User click on the My Itenarary button and verify the Booked Itenarary page$")
	public void user_click_on_the_My_Itenarary_button_and_verify_the_Booked_Itenarary_page() {
		clickOnElementBC(pom.getIp().getMyItenararyBtn());
		Assert.assertEquals("a", "A");
	}
}