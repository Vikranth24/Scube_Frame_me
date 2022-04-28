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

public class Premium_card_test extends Base_Class {
	@Test
	public void Home_Functional() throws InterruptedException
	{
		System.out.println();
		System.out.println("Executive_card_Test =to check filter of  Executive_card is working proper ");
		System.out.println();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		WebDriverWait wait=new 	WebDriverWait(driver, 25);
		
		ReadExcel a=new ReadExcel();
		String Pre_name=a.readStringDataFromExcel("Sheet6", 0, 0);
		String Pre_phone=a.readStringDataFromExcel("Sheet6", 0, 1);
		String Pre_desc=a.readStringDataFromExcel("Sheet6", 0, 2);
		String Pre_com=a.readStringDataFromExcel("Sheet6", 0, 3);
		String Pre_email=a.readStringDataFromExcel("Sheet6", 0, 4);
		
		
		Homepage home=new Homepage(driver);
		productspage pro=new productspage(driver);
		UtilityMethods Util=new UtilityMethods();
		
		
		home.product_link();
		Thread.sleep(5000);
		
		pro.premiumclick();
		
		
		for(int i=0;i<=1;i++){
			Util.scroll_down(driver);
			Thread.sleep(5000);
		}
		
		
		pro.premimumcard4click();
		Thread.sleep(5000);
		
		pro.premimumcardnameclick(Pre_name);
		Thread.sleep(5000);
		
		pro.premimumcardnumber(Pre_phone);
		Thread.sleep(5000);
		
		pro.premimumcarddesignation(Pre_desc);
		Thread.sleep(5000);
		
		pro.premimumcompany(Pre_com);
		Thread.sleep(5000);
		
		pro.premimumemailclick(Pre_email);
		Thread.sleep(5000);
		
		pro.premimumcardupload();
		Thread.sleep(20000);
		
		pro.premimumcardaddtocart();
		Thread.sleep(5000);
		
		pro.checkout();
		Thread.sleep(5000);	
		
		
	}}
