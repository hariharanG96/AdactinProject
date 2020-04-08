package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HotelSearch {

	public WebDriver driver;

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoomType() {
		return roomType;
	}

	public WebElement getRoomNo() {
		return roomNo;
	}

	public WebElement getDateIn() {
		return dateIn;
	}

	public WebElement getDateOut() {
		return dateOut;
	}

	public WebElement getAdultsCount() {
		return adultsCount;
	}

	public WebElement getChildCount() {
		return childCount;
	}

	public WebElement getSearch() {
		return search;
	}

	public HotelSearch(WebDriver odriver) {
		this.driver = odriver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "location")
	private WebElement location;

	@FindBy(id = "hotels")
	private WebElement hotels;

	@FindBy(id = "room_type")
	private WebElement roomType;

	@FindBy(id = "room_nos")
	private WebElement roomNo;

	@FindBy(id = "datepick_in")
	private WebElement dateIn;

	@FindBy(id = "datepick_out")
	private WebElement dateOut;

	@FindBy(id = "adult_room")
	private WebElement adultsCount;

	@FindBy(id = "child_room")
	private WebElement childCount;

	@FindBy(id = "Submit")
	private WebElement search;

}
