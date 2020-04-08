package com.adactin.runner;

import java.io.IOException;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.adactin.helper.FileReaderManager;
import com.baseclass.org.BaseClass;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\adactin\\feature", 
					glue = "com\\adactin\\stepdefenition",
					plugin = {"com.cucumber.listener.ExtentCucumberFormatter:Report/report.html",
								"html:Report/htmlReport.html",
								"json:Reports/jsonReport.json",
								"pretty"
							 },
					dryRun = false,
					strict = true,
					monochrome = true
					//tags = {"@SmokeTest","~@Regression"}
				)
public class Runner {

	public static WebDriver driver;
	
	@BeforeClass
	public static void environmentSetup() throws IOException {
		driver = BaseClass.getDriver(FileReaderManager.getFRM().getObjectCR().browserLaunch());
	}
}