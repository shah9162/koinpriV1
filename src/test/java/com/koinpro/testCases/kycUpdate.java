package com.koinpro.testCases;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.koinpro.pageObjects.LoginPage;
import com.koinpro.pageObjects.kycPageLocators;

public class kycUpdate extends BaseClass{
	
	@Test
	public void kycVerification001() throws InterruptedException {
		kycPageLocators kp = new kycPageLocators(driver);
		LoginPage lp = new LoginPage(driver);
		driver.get(baseURL);
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		lp.setUserName("jljr0835@yopmail.com");
		lp.setPassword(password);
		lp.clicksignUp();
//		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		Thread.sleep(2000);
		kp.clicksetting();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		kp.clickKyc_Link();
		try {
		
		if(driver.findElement(By.xpath("//div[contains(@class,'card-body my-cus')]")).isDisplayed() )  {
		System.out.println(" KYC successfully verified !!! ");
		
		}
		else  {
			System.out.println("hgfsjdhfshd");
			driver.findElement(By.xpath("//button[@class='cursorPointer btn btn-outline-primary btn-sm mr-4 active']")).click();
		}
		}catch(Exception e) {
			e.printStackTrace();
		}
				
		
	}

}
