package com.koinpro.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kycPageLocators {
	WebDriver ldriver;
	public kycPageLocators(WebDriver rdriver){
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	@FindBy(xpath="//a[normalize-space()='Profile']")
	@CacheLookup
	WebElement mainMenu;
	
	@FindBy(xpath="//a[normalize-space()='Setting']")
	@CacheLookup
	WebElement subMenu;
	
	@FindBy(xpath="//span[normalize-space()='Verify KYC']")
	@CacheLookup
	WebElement kyclink;
	
	@FindBy(xpath="//input[contains(@placeholder, 'Name')]")
	@CacheLookup
	WebElement name;
	
	@FindBy(xpath="//input[contains(@placeholder, 'Email id')]")
	@CacheLookup
	WebElement email;
	
	@FindBy(xpath="//input[contains(@placeholder, 'Address')]")
	@CacheLookup
	WebElement address;
	
	@FindBy(xpath="//input[contains(@placeholder, 'PostCode')]")
	@CacheLookup
	WebElement pincode;
	
	@FindBy(xpath="//input[contains(@placeholder, 'City')]")
	@CacheLookup
	WebElement city;
	
	@FindBy(xpath="//input[contains(@placeholder, 'country')]")
	@CacheLookup
	WebElement country;
	
	@FindBy(xpath="//input[contains(@placeholder, 'state')]")
	@CacheLookup
	WebElement state;
	
	@FindBy(xpath="//button[contains(@class, 'button lgeLPf')]")
	@CacheLookup
	WebElement saveProfile;
	
	public void clicksetting() {
		Actions actions = new Actions(ldriver);
		actions.moveToElement(mainMenu).perform();
//		actions.moveToElement(subMenu).click().perform();
		subMenu.click();
	}
	
	public void clickKyc_Link() {
		kyclink.click();
	}
	
	
	public void enterName(String Name) {
		name.clear();
	     name.sendKeys(Name);
	}
	
	public void enterAddress(String Address) {
		address.clear();
	     address.sendKeys(Address);
	}
	
	public void enterPincode(String Pincode) {
		pincode.clear();
	     pincode.sendKeys(String.valueOf(Pincode));
	}
	
	public void enterCity(String City) {
		city.clear();
	
	     city.sendKeys(City);
	}
	
	public void enterCounter(String Country) {
		country.clear();
	     country.sendKeys(Country);
	}
	
	public void enterState(String State) {
		state.clear();
	     state.sendKeys(State);
	}
	
	public void clickSaveProfileButton() {
		saveProfile.click();
	}
	

}
