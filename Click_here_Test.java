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

public class Click_here_Test extends Base_Class {
	@Test
	public void Home_Functional() throws InterruptedException
	{
		System.out.println();
		System.out.println("Executive_card_Test =to check filter of  Executive_card is working proper ");
		System.out.println();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		WebDriverWait wait=new 	WebDriverWait(driver, 25);
		
		
		ReadExcel a=new ReadExcel();
		String name=a.readStringDataFromExcel("Sheet9", 0, 0);
		String phone=a.readStringDataFromExcel("Sheet8", 0, 2);

		String email=a.readStringDataFromExcel("Sheet8", 0, 1);
		
		
		
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
		
		pro.clickhere();
		Thread.sleep(5000);
		
		pro.yournametextfield(name);
		Thread.sleep(5000);
		
		pro.youremailtextfield(email);
		Thread.sleep(5000);
		
		pro.yourphonenumber(phone);
		Thread.sleep(5000);
		
		pro.submitclick();
		Thread.sleep(5000);
		
		
		

}
}