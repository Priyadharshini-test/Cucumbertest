package com.priya.stepDefinition;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

import com.priya.pageObjects.Login_UI;
import com.priya.testBase.testBase;
import com.priya.testMethods.LoginBasicTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginBasicSteps extends testBase {
	WebDriver driver;
	@Given("propertyfile data tobe loaded")
	public void propertyfile_data_tobe_loaded() throws IOException {
		propertyFileSetup();
		System.out.println("propertyfilesetup method done");
	}

	@Given("browser setup tobe initialised")
	public void browser_setup_tobe_initialised() throws IOException, InterruptedException {
		String browser = "Firefox";
		driverSetUp(browser);
		System.out.println("driver setup method done");
		Thread.sleep(3000);
	}

	@Given("URL tobe loaded")
	public void url_tobe_loaded() throws IOException, InterruptedException {
		String url = "https://www.asda.com/";
		urlSetUp(url);
		System.out.println("url setup method done");
		Thread.sleep(3000);
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() throws InterruptedException, IOException {
		Login_UI loginpage = new Login_UI(driver);
		Thread.sleep(1000);
		loginpage.clickAcceptCookiesButton();
		loginpage.clickSigninButton();
		Reporter.log(signinButtonLocator);
		
		LoginBasicTest.readDataFromExcelFile(2, "login");
		
		loginpage.enterUsernameField(LoginBasicTest.username);
		loginpage.enterPasswordField(LoginBasicTest.password);
		loginpage.clickLoginButton();
		Reporter.log("login btn clicked");

	}

	@Then("login result tobe displayed")
	public void login_result_tobe_displayed() {
		if (driver.getPageSource().contains("Priya")) {
			System.out.println("User logged in Successfully");

		} else {

			System.out.println("Login attempt failed");
		}
	}

}