package com.juaracoding.automation.mystore;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.juaracoding.automation.driver.DriverSingleton;

public class Mystore {
	private WebDriver driver;
	
	public Mystore() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	//Home
	@FindBy(css = "#header_logo > a > img")
	private WebElement btnHome;
	
	//Dresses
	@FindBy(css = "#search_query_top")
	private WebElement btnDresses;
	
	//T-Shirt
	@FindBy(css = "#search_query_top")
	private WebElement btnTshirt;
	
	//Item_Dresses
	@FindBy(css = "div[id='best-sellers_block_right'] li:nth-child(1) a:nth-child(1) img:nth-child(1)")
	private WebElement btnItemDresses;

	//Item_Add_To_Cart
	@FindBy(css = "button[name='Submit']")
	private WebElement btnAddtocart;
	
	//Item_TShirt
	@FindBy(css = "div[id='best-sellers_block_right'] li:nth-child(2) a:nth-child(1) img:nth-child(1)")
	private WebElement btnItemTshirt;
	
	
	public void Dresses() {
		btnDresses.sendKeys("dresses");
		btnDresses.submit();
		btnItemDresses.click();
		btnAddtocart.click();
		btnTshirt.sendKeys("T-Shirt");
		btnTshirt.submit();
		btnItemTshirt.click();
		btnAddtocart.click();
		}
}
