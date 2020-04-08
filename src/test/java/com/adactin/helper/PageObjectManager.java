package com.adactin.helper;

import org.openqa.selenium.WebDriver;

import com.adactin.pom.BookingPage;
import com.adactin.pom.HotelSearch;
import com.adactin.pom.ItenaryPage;
import com.adactin.pom.LoginPage;
import com.adactin.pom.SelectHotelPage;

public class PageObjectManager {
	
	public static WebDriver driver;
	
	private BookingPage bp;
	private HotelSearch hs;
	private ItenaryPage it;
	private LoginPage lp;
	private SelectHotelPage shp;
	
	public PageObjectManager(WebDriver odriver) {
		this.driver=odriver;
	}

	public BookingPage getBp() {
		bp = new BookingPage(driver);
		return bp;
	}
	
	public HotelSearch getHs() {
		hs = new HotelSearch(driver);
		return hs;
	}

	public ItenaryPage getIp() {
		it = new ItenaryPage(driver);
		return it;
	}

	public LoginPage getLp() {
		lp = new LoginPage(driver);
		return lp;
	}
	
	public SelectHotelPage getShp() {
		shp = new SelectHotelPage(driver);
		return shp;
	}
}
