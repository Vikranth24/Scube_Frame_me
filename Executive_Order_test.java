package Functional_Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import POM_Repository.Add_To_Cartpage;
import POM_Repository.Compatible_devices_page;
import POM_Repository.Homepage;
import POM_Repository.productspage;
import generic.Base_Class;
import generic.JavaScriptUtil;
import generic.ReadExcel;
import generic.UtilityMethods;

public class Executive_Order_test extends Base_Class {
	@Test
	public void Home_Functional() throws InterruptedException
	{
		System.out.println();
		System.out.println("Executive_card_Test =to check filter of  Executive_card is working proper ");
		System.out.println();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		WebDriverWait wait=new 	WebDriverWait(driver, 25);
		
		
		ReadExcel a=new ReadExcel();
		String card_name=a.readStringDataFromExcel("Sheet7", 0, 0);
		String card_phone=a.readStringDataFromExcel("Sheet7", 0, 1);
		String card_desc=a.readStringDataFromExcel("Sheet7", 0, 2);
		String card_email=a.readStringDataFromExcel("Sheet7", 0, 3);
		
		
		
		Homepage home=new Homepage(driver);
		productspage pro=new productspage(driver);
		UtilityMethods Util=new UtilityMethods();
		
		home.product_link();
		Thread.sleep(5000);
		
		for(int i=0;i<=2;i++)
		{
			Util.scroll_down(driver);
			Thread.sleep(5000);
		}
		
		pro.CACARD8click();
		Thread.sleep(5000);
		
		pro.cacard8yourname(card_name);
		Thread.sleep(5000);
		
		pro.cacard8phonenumber(card_phone);
		Thread.sleep(5000);
		
		pro.cacard8yourdesignation(card_desc);
		Thread.sleep(5000);
		
		pro. cacard8youremail(card_email);
		Thread.sleep(5000);
		
		pro.cacard8addtocart();
		Thread.sleep(5000);
		
		pro.checkout();
		Thread.sleep(5000);
			
		
	}}