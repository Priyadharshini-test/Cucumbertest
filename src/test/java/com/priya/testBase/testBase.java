package com.priya.testBase;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testBase {
	protected static String excelFilePath = "./src/test/resources/excel/Testdata1.xlsx";
	protected static String username;
	protected static String password;
	
	protected static String textfilePath = "/resources/log/logfile.txt";
	File logfile = new File(textfilePath);
	
	WebDriver driver;
	//Below variables are declared for propertyFileSetup() method
	static Properties testdata;
	static String propertyFilePath = "./src/test/resources/properties/Config.properties";
	protected static String signinButtonLocator;
	public String userNameFieldLocator;
	protected static String passwordFieldLocator;
	protected static String loginButtonLocator;
	protected static String acceptCookiesBtnLocator;
	
	
	public void propertyFileSetup() throws IOException {

		testdata = new Properties();
		FileInputStream properties_file = new FileInputStream(propertyFilePath);
		testdata.load(properties_file);

		acceptCookiesBtnLocator = testdata.getProperty("acceptCookiesBtnLocator");
		signinButtonLocator = testdata.getProperty("signinButtonLocator");
		userNameFieldLocator = testdata.getProperty("userNameFieldLocator");
		passwordFieldLocator = testdata.getProperty("passwordFieldLocator");
		loginButtonLocator = testdata.getProperty("loginButtonLocator");	
		}
	public void driverSetUp(String browser) throws IOException {
		switch (browser) {
		case "Chrome":
			driver = new ChromeDriver();
			break;
		case "Firefox":
			driver = new FirefoxDriver();
			break;
		case "Edge":
			driver = new EdgeDriver();
		}}
	public void urlSetUp(String url) throws IOException {
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	
	}

