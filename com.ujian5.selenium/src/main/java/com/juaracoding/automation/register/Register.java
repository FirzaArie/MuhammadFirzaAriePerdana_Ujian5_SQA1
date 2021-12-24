package com.juaracoding.automation.register;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.juaracoding.automation.driver.DriverSingleton;

public class Register {
	
	private WebDriver driver;
	
	public Register() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	//Sign in
	@FindBy(css = "#header > div.nav > div > div > nav > div.header_user_info > a")
	private WebElement btnSignIn;
	
	//Create Email
	@FindBy(id = "email_create")
	private WebElement txtboxEmail;

	//Gender Mr.
	@FindBy(xpath = "//*[@id=\"id_gender1\"]")
	private WebElement clkboxGender;
		
	//Customer FirstName
	@FindBy(id = "customer_firstname")
	private WebElement txtboxCustFirstName;
		
	//Customer LastName
	@FindBy(id = "customer_lastname")
	private WebElement txtboxCustLastName;
	
	//Password
	@FindBy(id = "passwd")
	private WebElement txtboxPassword;
	
	//Date Of Birth days
	@FindBy(id = "days")
	private WebElement txtboxDays;
		
	//Date Of Birth months
	@FindBy(id = "months")
	private WebElement txtboxMonths;
		
	//Date Of Birth years
	@FindBy(id = "years")
	private WebElement txtboxYears;
		
	//First Name
	@FindBy(id = "firstname")
	private WebElement txtboxFirstName;
		
	//Last Name
	@FindBy(id = "lastname")
	private WebElement txtboxLastName;
		
	//Company
	@FindBy(id = "company")
	private WebElement txtboxCompany;
		
	//Address 1
	@FindBy(id = "address1")
	private WebElement txtboxAddress1;
		
	//Address 2
	@FindBy(id = "address2")
	private WebElement txtboxAddress2;
		
	//City
	@FindBy(id = "city")
	private WebElement txtboxCity;
	
	//State
	@FindBy(id = "id_state")
	private WebElement txtboxState;		
	
	//Zip / Postal
	@FindBy(id = "postcode")
	private WebElement txtboxPostCode;
	
	//Additional Information
	@FindBy(id = "other")
	private WebElement txtboxOther;

	//Home Phone
	@FindBy(id = "phone")
	private WebElement txtboxPhone;
	
	//Mobile Phone
	@FindBy(id = "phone_mobile")
	private WebElement txtboxPhoneMobile;

	//Address Alias 
	@FindBy(id = "alias")
	private WebElement txtboxAlias;
	
	//Sign in 
	@FindBy(id = "SubmitLogin")
	private WebElement chkSignIn;
	
	//Submit Account 
	@FindBy(id = "submitAccount")
	private WebElement btnRegister;
	
	public void SignIn() {
	WebDriverWait wait = new WebDriverWait(driver, 30);
	wait.until(ExpectedConditions.elementToBeClickable(btnSignIn));
	btnSignIn.click();	
	txtboxEmail.sendKeys("grotleuser35@gmail.com");	
	txtboxEmail.submit();	
	}
	
	public void Personal() {
	WebDriverWait wait = new WebDriverWait(driver, 10000);
	wait.until(ExpectedConditions.elementToBeClickable(clkboxGender));
	JavascriptExecutor js = (JavascriptExecutor)driver;	
//	js.executeScript("arguments[0].scrollIntoView();", txtboxEmail);	
	clkboxGender.click();
	txtboxCustFirstName.sendKeys("First");
	txtboxCustLastName.sendKeys("Last");
	txtboxPassword.sendKeys("password");
	js.executeScript("arguments[0].scrollIntoView();", txtboxDays);
	txtboxDays.sendKeys("5");
	txtboxMonths.sendKeys("Jan");
	txtboxYears.sendKeys("1989");
	}
	
	public void Address() {
	txtboxCompany.sendKeys("T");
	txtboxAddress1.sendKeys("Rumah");
	txtboxAddress2.sendKeys("Hijau");
	txtboxCity.sendKeys("City");
	JavascriptExecutor js = (JavascriptExecutor)driver;		
	js.executeScript("arguments[0].scrollIntoView();", txtboxState);
	txtboxState.sendKeys("Ala");
	txtboxPostCode.sendKeys("12345");
	txtboxOther.sendKeys("Nothing");
	txtboxPhone.sendKeys("00011122333");
	txtboxPhoneMobile.sendKeys("00011122334");
	btnRegister.click();
	}
	public void Account() {
		
	}
	
	
	
}
