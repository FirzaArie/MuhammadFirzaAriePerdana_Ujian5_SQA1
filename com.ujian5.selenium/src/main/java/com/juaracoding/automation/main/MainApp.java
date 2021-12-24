package com.juaracoding.automation.main;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.juaracoding.automation.checkout.Checkout;
import com.juaracoding.automation.driver.DriverSingleton;
import com.juaracoding.automation.mystore.Mystore;
import com.juaracoding.automation.register.Register;

public class MainApp {
public static void main(String[] args) {
	WebDriver driver = DriverSingleton.getInstance().getDriver();
	driver.get("http://automationpractice.com/index.php");
	
	Register register = new Register();
	register.SignIn();
	
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,200)");
	
	register.Personal();
	register.Address();
	
	Mystore mystore = new Mystore();
	mystore.Dresses();
	
	Checkout checkout = new Checkout();
	checkout.Chkout();
}
}
