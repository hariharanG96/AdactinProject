package com.adactin.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
	
	public static Properties p;
		
	public ConfigurationReader() throws IOException {

		File f =new File("F:\\Java\\CucumberTask\\src\\test\\java\\com\\adactin\\properties\\configuration.properties");
		FileInputStream fis = new FileInputStream(f);
		p = new Properties();
		p.load(fis);
	
	}
	
	public String browserLaunch() {
		String browserName = p.getProperty("browsername");
		return browserName;
	}

	public String urlLaunch() {
		String url = p.getProperty("url");
		return url;
		
	}

}