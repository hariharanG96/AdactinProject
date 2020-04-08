package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ItenaryPage {

	public WebDriver driver;

	@FindBy(xpath="//input[@id='my_itinerary']")
	private WebElement myItenararyBtn;

	public ItenaryPage(WebDriver odriver) {
		this.driver = odriver;
	}

	public WebElement getMyItenararyBtn() {
		return myItenararyBtn;
	}

}
