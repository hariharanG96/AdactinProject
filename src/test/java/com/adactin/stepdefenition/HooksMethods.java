package com.adactin.stepdefenition;

import com.baseclass.org.BaseClass;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;



public class HooksMethods extends BaseClass{
	
	@Before
	public void hooksMethodsA(Scenario scn) {
		System.out.println(scn.getName());
	}

	@After
	public void hooksMethodsB(Scenario scn) throws Throwable {
		if (scn.isFailed()) {
			screenshotBC("F:\\Java\\CucumberTask\\ScreenShot\\"+scn.getName()+".png");
		}
		System.out.println(scn.getStatus());
	}


}
