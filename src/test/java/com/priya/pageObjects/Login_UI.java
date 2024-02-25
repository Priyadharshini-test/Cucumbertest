package com.priya.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.priya.testBase.testBase;

public class Login_UI extends testBase {
	WebDriver driver;

	/*
	 * // Constructor public Login_UI(WebDriver driver) { this.driver = driver; }
	 */

	public Login_UI(WebDriver driver) {
		this.driver = driver;
	}

	/**
	 * getSigninButton - This method finds the Signinbutton Element in webpage *
	 * 
	 * @param Does not include any parameter
	 * @author Priya
	 * 
	 */
	public WebElement getSigninButton() throws InterruptedException {

		WebElement SigninButtonElement = driver.findElement(By.xpath(signinButtonLocator));
		return SigninButtonElement;
		// System.out.println("Sign in: " + signinButtonLocator);
		// WebElement SigninButtonElement =
		// driver.findElement(By.linkText(signinButtonLocator));
	}

	/**
	 * clickSigninButton - This method clicks on the Signin Button Element in
	 * webpage *
	 * 
	 * @param Does not include any parameter
	 * @author Priya
	 * 
	 */
	public void clickSigninButton() throws InterruptedException {

		System.out.println("Sign in: " + signinButtonLocator);
		WebElement SigninButton = getSigninButton();
		SigninButton.click();
	}

	/**
	 * getLoginButton - This method finds the Loginbutton Element in webpage *
	 * 
	 * @param Does not include any parameter
	 * @author Priya
	 * 
	 */
	private WebElement getLoginButton() throws InterruptedException {
		WebElement loginButtonElement = driver.findElement(By.cssSelector(loginButtonLocator));
		// WebElement loginButtonElement =
		// driver.findElement(By.cssSelector("button[type=\"submit\"]"));
		return loginButtonElement;
	}

	/**
	 * clickLoginButton - This method clicks on the Login Button Element
	 * 
	 * @param Does not include any parameter
	 * @author Priya
	 * 
	 */

	public void clickLoginButton() throws InterruptedException {
		WebElement loginButton = getLoginButton();
		loginButton.click();
	}

	/**
	 * getAcceptCookiesButton - This method finds the accept cookies button Element
	 * using xpath Locator
	 * 
	 * @param Does not include any parameter
	 * @author Priya
	 * 
	 */

	private WebElement getAcceptCookiesButton() throws InterruptedException {

		WebElement acceptCookiesButtonElement = driver.findElement(By.xpath(acceptCookiesBtnLocator));
		return acceptCookiesButtonElement;
		// WebElement acceptCookiesButtonElement =
		// driver.findElement(By.xpath("//button[@id=\"onetrust-accept-btn-handler\"]"));
	}

	/**
	 * clickAcceptCookiesButton - This method clicks on the Accept cookies Button
	 * Element
	 * 
	 * @param Does not include any parameter
	 * @author Priya
	 * @throws InterruptedException
	 * 
	 */

	public void clickAcceptCookiesButton() throws InterruptedException {
		WebElement AcceptCookiesButton = getAcceptCookiesButton();
		AcceptCookiesButton.click();

	}

	/**
	 * enterUsernameField - This method identifies and enter text in the username
	 * field
	 * 
	 * @param username from testdata Excel file (String username)
	 * @author Priya
	 * 
	 */
	public void enterUsernameField(String username) {
		driver.findElement(By.xpath(userNameFieldLocator)).sendKeys(username);
		// driver.findElement(By.xpath("//input[@aria-label='Email or phone
		// number']")).sendKeys(username);

	}

	/**
	 * enterPasswordField - This method identifies and enter text in the password
	 * field
	 * 
	 * @param password from testdata Excel file (String password)
	 * @author Priya
	 * 
	 */

	public void enterPasswordField(String password) {

		driver.findElement(By.xpath(passwordFieldLocator)).sendKeys(password);
		// driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);

	}

}
